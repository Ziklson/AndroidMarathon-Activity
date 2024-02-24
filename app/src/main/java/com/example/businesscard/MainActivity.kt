package com.example.businesscard

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                    color = Color(0xFFD2E8D4),
                    modifier = Modifier.fillMaxSize()

                ) {
                    BusinessCard()
                }
            }
        }
        Log.d(getString(R.string.tag_log), "onCreate LOG MESSAGE")

        finish()
    }
    override fun onStart() {
        super.onStart()
        Log.d(getString(R.string.tag_log), "onStart LOG MESSAGE")
    }

    override fun onResume() {
        super.onResume()
        Log.d(getString(R.string.tag_log), "onResume LOG MESSAGE")
    }

    override fun onPause() {
        super.onPause()
        Log.d(getString(R.string.tag_log), "onPause LOG MESSAGE")
    }


    override fun onStop() {
        super.onStop()
        Log.d(getString(R.string.tag_log), "onStop LOG MESSAGE")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(getString(R.string.tag_log), "onDestroy LOG MESSAGE")
    }

}

@Composable
fun BusinessCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            Modifier
                .fillMaxHeight(0.2f)
                .background(Color(0xFF073042))
                .rotate(15.0F),

            )
        Text(
            text = stringResource(R.string.full_name),
            fontSize = 45.sp,
            color = Color.Black,
        )
        Text(
            text = stringResource(R.string.title),
            fontSize = 35.sp,
            color = Color(0xFF006A34)
        )
        Spacer(
            modifier = Modifier.padding(bottom = 100.dp)
        )
        ContactRow(
            text = stringResource(R.string.phone_number),
            icon = Icons.Rounded.Phone
        )
        ContactRow(
            text = stringResource(R.string.social_media),
            icon = Icons.Rounded.Share
        )
        ContactRow(
            text = stringResource(R.string.email),
            icon = Icons.Rounded.Email
        )
    }
}

@Composable
fun ContactRow(
    text: String, icon: ImageVector
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(20.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF006D3B),
            modifier = Modifier.weight(1f)
        )
        Text(
            text = text,
            color = Color.Black,
            fontSize = 20.sp,
            modifier = Modifier.weight(3f)


        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(), color = Color(0xFFD2E8D4)
    ) {
        BusinessCardTheme {
            BusinessCard()
        }
    }
}