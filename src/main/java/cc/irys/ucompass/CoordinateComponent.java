package cc.irys.ucompass;

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

import io.wispforest.owo.ui.component.LabelComponent;

public class CoordinateComponent extends LabelComponent {
	private PlayerPosition playerPosition = new PlayerPosition(MinecraftClient.getInstance());

	public CoordinateComponent() {
		super(Text.empty());
		this.shadow = true;
	}

	@Override
	public void update(float delta, int mouseX, int mouseY) {
		super.update(delta, mouseX, mouseY);
		this.text = Text.literal("Pos: " + this.playerPosition.getPositionString());
		this.notifyParentIfMounted();
	}
}
