package cc.irys.ucompass;

import net.minecraft.util.Identifier;

import io.wispforest.owo.ui.hud.Hud;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UCompass implements ClientModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("uCompass");
	public static final Identifier OVERLAY_IDENTIFIER = new Identifier("ucompass", "hud_overlay");

	@Override
	public void onInitializeClient(ModContainer mod) {
		Hud.add(OVERLAY_IDENTIFIER, HudOverlay::new);
		LOGGER.info("{}/{} loaded, nya~", mod.metadata().name(), mod.metadata().version());
	}
}
