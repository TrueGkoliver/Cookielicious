package com.evoslab.cookielicious.client;

import com.evoslab.cookielicious.core.Cookielicious;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;
import java.util.Set;

/**
 * @author bageldotjpg (adapted by Epic312)
 * Handles distribution of capes to Cookielicious team. Original code by bagel for Abnormals Core, I just took it and put it here with minor tweaks.
 */
@Mod.EventBusSubscriber(modid = Cookielicious.MOD_ID)
public final class CapeHandler {
    private static final ResourceLocation CAPE_TEXTURE = new ResourceLocation(Cookielicious.MOD_ID, "textures/cookie_cape.png");
    private static final ImmutableSet<String> UUIDS = ImmutableSet.of(
            "519ea930-dac0-468f-ab06-3b530b7a3304", // Epic312
            "631b7d0b-23c5-4341-bcc1-87fc02f8840a", // Evoli_934 (Evo)
            "dbf0d6e0-c3c4-4818-918f-62b7e08f2e59", // AvocadoGA66 (AvocadoSpud)
            "b16f336c-ddae-4e81-8aa4-89fc87bb8292", // narywastaken (Nary)
            "4b704123-869a-4a15-972c-84cb8820f733", // stardust9999 (Stardust)
            "a217dbc6-f6b0-4c8a-a450-e1f87b61c83e"  // EltrutLikes
    );

    private static final Set<String> RENDERED = Sets.newHashSet();

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderPlayer(RenderPlayerEvent.Post event) {
        PlayerEntity player = event.getPlayer();
        String uuid = PlayerEntity.getUUID(player.getGameProfile()).toString();
        if (player instanceof AbstractClientPlayerEntity && UUIDS.contains(uuid) && !RENDERED.contains(uuid)) {
            AbstractClientPlayerEntity clientPlayer = (AbstractClientPlayerEntity) player;
            if (clientPlayer.hasPlayerInfo()) {
                Map<MinecraftProfileTexture.Type, ResourceLocation> playerTextures = clientPlayer.playerInfo.playerTextures;
                playerTextures.put(MinecraftProfileTexture.Type.CAPE, CAPE_TEXTURE);
                playerTextures.put(MinecraftProfileTexture.Type.ELYTRA, CAPE_TEXTURE);
                RENDERED.add(uuid);
            }
        }
    }
}