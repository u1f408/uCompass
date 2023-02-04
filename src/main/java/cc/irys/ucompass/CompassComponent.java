package cc.irys.ucompass;

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

import io.wispforest.owo.ui.component.LabelComponent;

public class CompassComponent extends LabelComponent {
	private PlayerPosition playerPosition = new PlayerPosition(MinecraftClient.getInstance());

	public CompassComponent() {
		super(Text.empty());
		this.shadow = true;
	}

	@Override
	public void update(float delta, int mouseX, int mouseY) {
		super.update(delta, mouseX, mouseY);
		this.text = Text.literal(String.format("%d°", this.playerPosition.getHeading()));
		this.notifyParentIfMounted();
	}
}
