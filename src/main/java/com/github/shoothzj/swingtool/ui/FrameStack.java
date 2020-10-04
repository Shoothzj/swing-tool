package com.github.shoothzj.swingtool.ui;

import com.github.shoothzj.swingtool.ui.base.BaseFrame;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;
import java.util.Stack;

/**
 * @author hezhangjian
 */
@Slf4j
public class FrameStack {

    public static final Stack<BaseFrame> frameStack = new Stack<>();

    public static Optional<BaseFrame> peek() {
        if (frameStack.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(frameStack.peek());
    }

    public static void push(BaseFrame baseFrame) {
        frameStack.push(baseFrame);
    }

    public static Optional<BaseFrame> pop() {
        if (frameStack.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(frameStack.pop());
    }

}
