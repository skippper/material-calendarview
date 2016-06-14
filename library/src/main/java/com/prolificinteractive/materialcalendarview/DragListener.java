package com.prolificinteractive.materialcalendarview;

/**
 * Created by norbert.sziraczki on 13/06/16.
 */

public interface DragListener {
    
    void onDragDropped(CalendarDay dayView);

    void onDragEntered(CalendarDay dayView);

    void onDragExited(CalendarDay dayView);

    void onDragStarted(CalendarDay dayView);

    void onDragEnded(CalendarDay dayView);

}
