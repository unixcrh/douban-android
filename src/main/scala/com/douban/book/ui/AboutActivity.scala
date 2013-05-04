package com.douban.book.ui

import com.douban.base.DoubanActivity
import android.os.Bundle
import com.douban.book.R

/**
 * Copyright by <a href="http://crazyadam.net"><em><i>Joseph J.C. Tang</i></em></a> <br/>
 * Email: <a href="mailto:jinntrance@gmail.com">jinntrance@gmail.com</a>
 * @author joseph
 * @since 5/4/13 7:00 PM
 * @version 1.0
 */
class AboutActivity extends DoubanActivity{
  protected override def onCreate(b: Bundle) {
    super.onCreate(b)
    setContentView(R.layout.about)
  }
}
