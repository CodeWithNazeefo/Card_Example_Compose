package com.codewithnazeefo.basicapp

import android.icu.text.ListFormatter.Width
import android.os.Bundle
import android.os.Message
import android.view.Gravity
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codewithnazeefo.basicapp.ui.theme.BasicAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val profilePainter = painterResource(id = R.drawable.pic5)
            val postPainter = painterResource(id = R.drawable.pic5)
            val autherName = "Nazeef Khan"
            val contentDescription = "MIT’s educational ideals in the online classroom, behind the scenes of OpenCourseWare’s podcast Chalk Radio, and more"
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
           ){

            PostView(
                profilePainter = profilePainter,
                postPainter = postPainter,
                autherName = autherName,
                contentDescription = contentDescription
            )
               PostView(
                profilePainter = profilePainter,
                postPainter = postPainter,
                autherName = autherName,
                contentDescription = contentDescription
            )


           }
        }


    }
}

@Composable
fun PostView(
    profilePainter: Painter,
    postPainter: Painter,
    autherName: String,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier
            .height(350.dp)
            .fillMaxWidth()
            .padding(15.dp),
              colors = CardDefaults.cardColors(
            containerColor = Color.White),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
    ) {
        Row {
            Image(
                painter = profilePainter, contentDescription = autherName,
                Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .padding(8.dp)
                    .clip(CircleShape), contentScale = ContentScale.Crop
            )
            Text(
                modifier = Modifier.offset(0.dp, 15.dp),
                text = autherName,
                style = TextStyle(Color.Black),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )


        }
        Column {
            Card(
                modifier = Modifier
                    .offset(0.dp, 10.dp)
                    .fillMaxSize(), shape = RoundedCornerShape(16.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize()) {

                    Image(
                        painter = postPainter,
                        contentDescription = contentDescription,
                        Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                brush = Brush.verticalGradient(
                                    colors = listOf(
                                        Color.Transparent,
                                        Color.Black
                                    ), startY = 300f
                                )
                            )
                    )
                    Box(
                        modifier = Modifier
                            .padding(15.dp, 40.dp)
                            .fillMaxSize(),
                        contentAlignment = Alignment.BottomStart
                    ) {
                        Text(
                            text = contentDescription,
                            style = TextStyle(Color.White),
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    }
                }
            }
        }

    }
}