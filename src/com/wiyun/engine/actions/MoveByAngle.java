package com.wiyun.engine.actions;

import com.wiyun.engine.types.WYPoint;

/**
 * \if English
 * Move a node by set a direction in angle and a velocity
 * \else
 * 根据角度和速度移动的动作封装
 * \endif
 */
public class MoveByAngle extends IntervalAction {
	/**
	 * \if English
	 * static constructor
	 *
	 * @param duration duration time of action
	 * @param degree move direction in angle
	 * @param velocity move velocity
	 * \else
	 * 静态构造函数
	 *
	 * @param duration 动作持续的时间
	 * @param degree 节点移动的角度
	 * @param velocity 节点移动的速度
	 * \endif
	 */
    public static MoveByAngle make(float duration, int degree, int velocity) {
        return new MoveByAngle(duration, degree, velocity);
    }

    protected MoveByAngle(float duration, int degree, int velocity) {
    	nativeInit(duration, degree, velocity);
    }
    
    private native void nativeInit(float duration, int degree, int velocity);

    public static MoveByAngle from(int pointer) {
    	return pointer == 0 ? null : new MoveByAngle(pointer);
    }
    
    protected MoveByAngle(int pointer) {
    	super(pointer);
	}

	@Override
    public IntervalAction copy() {
        return new MoveByAngle(nativeCopy());
    }

    @Override
    public IntervalAction reverse() {
        return new MoveByAngle(nativeReverse());
    }
    
	/**
	 * \if English
	 * set pin point
	 *
	 * @param p global coordinate of pin point
	 * \else
	 * 设置pin point
	 *
	 * @param p pin point的全局坐标
	 * \endif
	 */
	public void setPinPoint(WYPoint p) {
		setPinPoint(p.x, p.y);
	}

	/**
	 * \if English
	 * set pin point
	 *
	 * @param x global x location of pin point
	 * @param y global y location of pin point
	 * \else
	 * 设置pin point
	 *
	 * @param x pin point的全局x位置
	 * @param y pin point的全局y位置
	 * \endif
	 */
	public native void setPinPoint(float x, float y);

	/**
	 * \if English
	 * get pin point
	 *
	 * @return global coordinate of pin point
	 * \else
	 * 得到pin point
	 *
	 * @return pin point的全局坐标
	 * \endif
	 */
	public WYPoint getPinPoint() {
		WYPoint p = WYPoint.makeZero();
		nativeGetPinPoint(p);
		return p;
	}
	
	private native void nativeGetPinPoint(WYPoint p);

	/**
	 * \if English
	 * clear pin point
	 * \else
	 * 清除掉pin point, 这样节点移动时将不再自动对准pin point
	 * \endif
	 */
	public native void clearPinPoint();

	/**
	 * \if English
	 * set angle delta of pin point rotation
	 *
	 * @param angle to be added to node rotation
	 * \else
	 * 设置附加角度, 仅当pin point被设置时有效
	 *
	 * @param delta 附加角度
	 * \endif
	 */
	public native void setPinAngleDelta(float delta);

	/**
	 * \if English
	 * get angle delta
	 *
	 * @return angle delta
	 * \else
	 * 得到附加角度
	 *
	 * @return 附加角度
	 * \endif
	 */
	public native float getPinAngleDelta();
}