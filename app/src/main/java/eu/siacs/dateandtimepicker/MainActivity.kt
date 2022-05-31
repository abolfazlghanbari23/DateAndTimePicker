package eu.siacs.dateandtimepicker

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import eu.siacs.dateandtimepicker.dialog.SingleDateAndTimePickerDialog
import java.security.AccessController.getContext
import java.util.*

class MainActivity : AppCompatActivity() {
    private var singleBuilder: SingleDateAndTimePickerDialog.Builder? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        simpleClicked()

        singleBuilder?.display()
    }


    private fun simpleClicked() {
//        val calendar = Calendar.getInstance()
//        val today=calendar.time
//        calendar.add(Calendar.YEAR,1)
//        val nextYear=calendar.time
        singleBuilder = SingleDateAndTimePickerDialog.Builder(this)
            .setTimeZone(TimeZone.getDefault())
            .bottomSheet()
            .curved()
            //.backgroundColor(Color.BLACK)
            //.mainColor(Color.GREEN)
            .displayHours(true)
            .displayMinutes(true)
            .displayDays(true)
            .mustBeOnFuture()
            .minutesStep(1)
            .displayAmPm(false)
//            .backgroundColor(Color.WHITE)
//            .mainColor(Color.BLACK)
//            .titleTextColor(Color.GREEN)

            .title("پیام زمانبندی")


            .listener { date ->

                Log.i("havij",date.time.toString())
                Log.i("havij",System.currentTimeMillis().toString())
                Toast.makeText(this,date.toString(), Toast.LENGTH_LONG).show()
                Log.i("mehdi",date.time.toString())
            }
    }
}