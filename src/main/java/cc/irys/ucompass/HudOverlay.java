package cc.irys.ucompass;

import io.wispforest.owo.ui.core.*;
import io.wispforest.owo.ui.container.VerticalFlowLayout;

public class HudOverlay extends VerticalFlowLayout {
	public HudOverlay() {
		super(Sizing.fill(100), Sizing.content());
		this.positioning.set(Positioning.absolute(0, 0));
		this.horizontalAlignment.set(HorizontalAlignment.CENTER);
		this.padding.set(Insets.of(4));

		// add our children
		this.children.add(new CompassComponent());
		this.children.add(new CoordinateComponent());
		this.updateLayout();
	}
}
