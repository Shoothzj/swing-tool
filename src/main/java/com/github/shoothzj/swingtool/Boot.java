package com.github.shoothzj.swingtool;

import com.github.shoothzj.swingtool.ui.frame.MainFrame;
import lombok.extern.slf4j.Slf4j;

/**
 * @author hezhangjian
 */
@Slf4j
public class Boot {

    public static void main(String[] args) {
        final MainFrame mainFrame = new MainFrame();
        mainFrame.showFrame();
    }

}
