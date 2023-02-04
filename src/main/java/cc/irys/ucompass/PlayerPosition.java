package cc.irys.ucompass;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.Vec3d;

public class PlayerPosition {
	private final MinecraftClient client;

	public PlayerPosition(MinecraftClient client) {
		this.client = client;
	}

	public int getHeading() {
		assert client.player != null;
		int angle = (int) client.player.getRotationClient().y;
		while (angle >= 360) angle -= 360;
		while (angle <= 0) angle += 360;
		
		// correct so 360 degrees is *north* instead of south.
		// y'know, like it is on an actual compass. i dunno what
		// fuckin shit the unnamed minecraft dev was smoking, but
		// i want absolutely none of it
		return 1 + (angle + 180) % 360;
	}

	public Vec3d getPosition() {
		assert client.player != null;
		return client.player.getPos();
	}

	public String getPositionString() {
		Vec3d pos = this.getPosition();
		return String.format("%.0f %.0f %.0f", pos.x, pos.y, pos.z); 
	}
}
