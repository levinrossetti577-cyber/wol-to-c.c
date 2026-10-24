
package de.catgirlwolf.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.EntityType;

public class CatgirlWolfClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(
            CatgirlWolfModel.LAYER,
            CatgirlWolfModel::createBodyLayer
        );
        EntityRenderers.register(EntityType.WOLF, CatgirlWolfRenderer::new);
    }
}
