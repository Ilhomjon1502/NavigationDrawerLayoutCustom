package uz.ilhomjon.mycustomnavigationdrawerlayout

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import uz.ilhomjon.mycustomnavigationdrawerlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

        binding.appBarMain.menuImage.setOnClickListener {
            Toast.makeText(this, "Image", Toast.LENGTH_SHORT).show()
            binding.drawerLayout.openDrawer(Gravity.START);
        }
    }

}