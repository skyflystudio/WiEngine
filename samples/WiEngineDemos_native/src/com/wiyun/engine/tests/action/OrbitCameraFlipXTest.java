package com.wiyun.engine.tests.action;

import com.wiyun.engine.WiEngineTestActivity;

public class OrbitCameraFlipXTest extends WiEngineTestActivity {
	private native void nativeStart();

	@Override
	protected void runDemo() {
		nativeStart();
	}
}
