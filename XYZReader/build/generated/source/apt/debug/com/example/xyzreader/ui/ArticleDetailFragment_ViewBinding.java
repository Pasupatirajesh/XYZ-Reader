// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.xyzreader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ArticleDetailFragment_ViewBinding implements Unbinder {
  private ArticleDetailFragment target;

  @UiThread
  public ArticleDetailFragment_ViewBinding(ArticleDetailFragment target, View source) {
    this.target = target;

    target.mPhotoView = Utils.findRequiredViewAsType(source, R.id.photo, "field 'mPhotoView'", ImageView.class);
    target.titleView = Utils.findRequiredViewAsType(source, R.id.article_title, "field 'titleView'", TextView.class);
    target.bylineView = Utils.findOptionalViewAsType(source, R.id.article_by_line, "field 'bylineView'", TextView.class);
    target.bodyView = Utils.findRequiredViewAsType(source, R.id.article_body, "field 'bodyView'", TextView.class);
    target.mFab = Utils.findRequiredViewAsType(source, R.id.share_fab, "field 'mFab'", FloatingActionButton.class);
    target.mNestedScrollView = Utils.findRequiredViewAsType(source, R.id.nestedScrollView, "field 'mNestedScrollView'", NestedScrollView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ArticleDetailFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPhotoView = null;
    target.titleView = null;
    target.bylineView = null;
    target.bodyView = null;
    target.mFab = null;
    target.mNestedScrollView = null;
  }
}
