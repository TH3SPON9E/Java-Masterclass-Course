package com.nmbrookes;

public class Button {
    private String title;
    private OnClickListener onclickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onclickListener = onClickListener;
    }

    public void onCLick() {
        this.onclickListener.onClick(this.title);
    }

    public interface OnClickListener {
        public void onClick(String title);

    }
}
