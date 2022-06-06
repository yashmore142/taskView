package com.example.taskview

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Color.RED
import android.hardware.camera2.params.RggbChannelVector.RED
import android.util.AttributeSet
import android.view.View
import android.widget.TextView


@SuppressLint("AppCompatCustomView")
class TaskView(context: Context, attributes: AttributeSet?):TextView(context,attributes) {

    var taskStatus=false
    set(value){
        field=value
        if(field){
            setTextColor(Color.GREEN)
        }
        else{
            setTextColor(Color.RED)
        }
    }
init {
        setTextColor(Color.RED)
    this.setOnClickListener(object :OnClickListener{
        override fun onClick(v: View?) {
        taskStatus=!taskStatus
        }
    })
}
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.strokeWidth=7f
        canvas?.drawLine(90f,0f,90f,90f,paint)
        canvas?.drawLine(110f,0f,110f,90f,paint)
    }
}
