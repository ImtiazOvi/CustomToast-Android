package com.imtiaz.customtoast;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MIUToast {
    // There are 4 types of toast (success, error, warning, plainText)
    // showing text with success icon and with green background
    public static void success(Context context, String message) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_toast_layout, ((Activity) context).findViewById(R.id.toast_root));
        // set a message
        TextView text = layout.findViewById(R.id.txt_toast_msg);
        text.setText(message);
        // image view
        ImageView icon = layout.findViewById(R.id.img_success);
        icon.setImageResource(R.drawable.ic_success);
        // Toast...
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER | Gravity.BOTTOM, 0, 56);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    // showing text with error icon and with red background
    public static void error(Context context, String message) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_toast_layout, ((Activity) context).findViewById(R.id.toast_root));
        // set a message
        TextView text = layout.findViewById(R.id.txt_toast_msg);
        text.setText(message);
        // image view
        ImageView icon = layout.findViewById(R.id.img_success);
        icon.setImageResource(R.drawable.ic_error);
        // Toast...
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER | Gravity.BOTTOM, 0, 56);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }


    // showing text with out icon
    public static void warning(Context context, String message) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_toast_layout, ((Activity) context).findViewById(R.id.toast_root));
        // set a message
        TextView text = layout.findViewById(R.id.txt_toast_msg);
        text.setText(message);
        // image view
        ImageView icon = layout.findViewById(R.id.img_success);
        icon.setImageResource(R.drawable.ic_warning);
        // Toast...
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER | Gravity.BOTTOM, 0, 56);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    // showing text with out icon
    public static void plainText(Context context, String message) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.custom_toast_layout, ((Activity) context).findViewById(R.id.toast_root));
        // set a message
        TextView text = layout.findViewById(R.id.txt_toast_msg);
        text.setText(message);
        // image view
        ImageView icon = layout.findViewById(R.id.img_success);
        icon.setVisibility(View.GONE);
        // Toast...
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER | Gravity.BOTTOM, 0, 56);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
