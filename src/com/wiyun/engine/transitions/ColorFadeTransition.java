/*
 * Copyright (c) 2010 WiYun Inc.
 * Author: luma(stubma@gmail.com)
 *
 * For all entities this program is free software; you can redistribute
 * it and/or modify it under the terms of the 'WiEngine' license with
 * the additional provision that 'WiEngine' must be credited in a manner
 * that can be be observed by end users, for example, in the credits or during
 * start up. (please find WiEngine logo in sdk's logo folder)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.wiyun.engine.transitions;

import com.wiyun.engine.nodes.Scene;
import com.wiyun.engine.types.WYColor3B;

/**
 * 一个颜色层由透明变成不透明，再由不透明变成透明
 */
public class ColorFadeTransition extends TransitionScene {
	/**
	 * 静态构造函数
	 *
	 * @param duration 场景切换的时间
	 * @param inScene 准备载入的\link Scene Scene对象指针\endlink. 如果不为NULL, 则
	 * 		载出场景自动设置为当前场景. 如果为NULL, 则载入场景和载出场景都不设置. 需要在之后再
	 * 		自行设置. 一般如果是想在popScene的时候, 需要把这个参数设置为NULL, 这样\link Director Director\endlink
	 * 		会自动设置载入和载出场景.
	 * @param rgb 颜色层颜色\link Color3B Color3B结构\endlink
	 * @return {@link ColorFadeTransition}
	 */
    public static ColorFadeTransition make(float duration, Scene inScene, WYColor3B rgb) {
        return new ColorFadeTransition(duration, inScene, rgb);
    }

    /**
     * initializes the transition with a duration and with an RGB color
     */
    protected ColorFadeTransition(float duration, Scene inScene, WYColor3B rgb) {
    	nativeInit(duration, inScene, rgb);
    }
    
    /**
     * 从底层指针获得一个ColorFadeTransition的Java对象
     * 
     * @param pointer 底层指针
     * @return {@link ColorFadeTransition}
     */
    public static ColorFadeTransition from(int pointer) {
    	return pointer == 0 ? null : new ColorFadeTransition(pointer);
    }
    
    protected ColorFadeTransition(int pointer) {
    	super(pointer);
    }
    
    private native void nativeInit(float duration, Scene inScene, WYColor3B rgb);

    /**
     * initializes the transition with a duration
     */
    public ColorFadeTransition(float duration, Scene inScene) {
        this(duration, inScene, new WYColor3B(0, 0, 0));
    }
}
