@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.individual_project_ii

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.individual_project_ii.ui.theme.Individual_Project_IITheme
import kotlinx.coroutines.delay


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Individual_Project_IITheme {
                MainApp()
            }
        }
    }
}

@Composable
fun MainApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") {
            WelcomeScreen {
                navController.navigate("signup_login") {
                    popUpTo("welcome") { inclusive = true }
                }
            }
        }
        composable("signup_login") {
            SignUpLoginScreen(navController)
        }
        composable("signup_screen") {
            SignUp(navController)
        }
        composable("login_screen") {
            Login(navController)
        }
        composable("question_1_screen") {
            Question1(navController)
        }
        composable("question_2_screen") {
            Question2(navController)
        }
        composable("question_3_screen") {
            Question3(navController)
        }
        composable("question_4_screen") {
            Question4(navController)
        }
        composable("question_5_screen") {
            Question5(navController)
        }
        composable("question_6_screen") {
            Question6(navController)
        }
        composable("question_7_screen") {
            Question7(navController)
        }
        composable("stats_screen") {
            Statistics(navController)
        }
    }
}

@Composable
fun WelcomeScreen(onTimeout: () -> Unit) {
    LaunchedEffect(Unit) {
        delay(5000) // Delay for 5 seconds
        onTimeout()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF222431)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(100.dp))

        Image(
            painter = painterResource(id = android.R.drawable.ic_menu_view),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "WELCOME",
            color = Color(0xFF2C859A),
            fontSize = 48.sp,
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "TO",
            color = Color(0xFF2C859A),
            fontSize = 48.sp,
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "CYBER-UX",
            color = Color(0xFF2C859A),
            fontSize = 48.sp,
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "By Andrea Mejia Saavedra",
            color = Color(0xFF2C859A),
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
        )
    }
}

@Composable
fun SignUpLoginScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF222431)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(100.dp))

        Image(
            painter = painterResource(id = android.R.drawable.ic_menu_view),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color(0xFF5ED9F6))
        )

        Spacer(modifier = Modifier.height(60.dp))

        Button(
            onClick = { navController.navigate("signup_screen") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
                .height(48.dp),
            shape = RoundedCornerShape(0.dp),
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2C859A)
            )
        ) {
            Text(
                text = "SIGN UP",
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(60.dp))

        Button(
            onClick = { navController.navigate("login_screen") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
                .height(48.dp),
            shape = RoundedCornerShape(0.dp),
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2C859A)
            )
        ) {
            Text(
                text = "LOGIN",
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace,
                textAlign = TextAlign.Center
            )
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp(navController: NavController) {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var dateOfBirth by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF222431))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(20.dp))

// Back button
        Image(
            painter = painterResource(id = android.R.drawable.ic_menu_revert),
            contentDescription = "Back",
            modifier = Modifier
                .size(50.dp)
                .offset(x = (-180).dp, y = (-10).dp)
                .clickable {
                    navController.popBackStack() // Navigate back to the previous screen
                },
            colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color(0xFF5ED9F6))
        )

        Spacer(modifier = Modifier.height(20.dp))

// Eye icon
        Image(
            painter = painterResource(id = android.R.drawable.ic_menu_view),
            contentDescription = null,
            modifier = Modifier.size(100.dp),
            colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color(0xFF5ED9F6))
        )

        Spacer(modifier = Modifier.height(20.dp))

        // First Name Field
        TextField(
            value = firstName,
            onValueChange = { firstName = it },
            placeholder = { Text("First Name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
                .height(48.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedTextColor = Color(0xFF2C859A),
                unfocusedTextColor = Color(0xFF2C859A),
                containerColor = Color.Transparent,
                focusedIndicatorColor = Color(0xFF2C859A),
                unfocusedIndicatorColor = Color(0xFF2C859A),
                cursorColor = Color(0xFF2C859A)
            ),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Last Name Field
        TextField(
            value = lastName,
            onValueChange = { lastName = it },
            placeholder = { Text("Last Name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
                .height(48.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedTextColor = Color(0xFF2C859A),
                unfocusedTextColor = Color(0xFF2C859A),
                containerColor = Color.Transparent,
                focusedIndicatorColor = Color(0xFF2C859A),
                unfocusedIndicatorColor = Color(0xFF2C859A),
                cursorColor = Color(0xFF2C859A)
            ),
            textStyle = TextStyle(
                color = Color(0xFF2C859A), fontSize = 16.sp, fontFamily = FontFamily.Monospace
            ),
            singleLine = true
        )


        Spacer(modifier = Modifier.height(20.dp))

        // Date of Birth Field
        TextField(
            value = dateOfBirth,
            onValueChange = { dateOfBirth = it },
            placeholder = { Text("Date Of Birth Ex: 01/01/99") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
                .height(48.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedTextColor = Color(0xFF2C859A),
                unfocusedTextColor = Color(0xFF2C859A),
                containerColor = Color.Transparent,
                focusedIndicatorColor = Color(0xFF2C859A),
                unfocusedIndicatorColor = Color(0xFF2C859A),
                cursorColor = Color(0xFF2C859A)
            ),
            textStyle = TextStyle(
                color = Color(0xFF2C859A), fontSize = 16.sp, fontFamily = FontFamily.Monospace
            ),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Email Field
        TextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text("Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
                .height(48.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedTextColor = Color(0xFF2C859A),
                unfocusedTextColor = Color(0xFF2C859A),
                containerColor = Color.Transparent,
                focusedIndicatorColor = Color(0xFF2C859A),
                unfocusedIndicatorColor = Color(0xFF2C859A),
                cursorColor = Color(0xFF2C859A)
            ),
            textStyle = TextStyle(
                color = Color(0xFF2C859A), fontSize = 16.sp, fontFamily = FontFamily.Monospace
            ),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Password Field
        TextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text("Password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
                .height(48.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedTextColor = Color(0xFF2C859A),
                unfocusedTextColor = Color(0xFF2C859A),
                containerColor = Color.Transparent,
                focusedIndicatorColor = Color(0xFF2C859A),
                unfocusedIndicatorColor = Color(0xFF2C859A),
                cursorColor = Color(0xFF2C859A)
            ),
            textStyle = TextStyle(
                color = Color(0xFF2C859A), fontSize = 16.sp, fontFamily = FontFamily.Monospace
            ),
            singleLine = true
        )


        Spacer(modifier = Modifier.height(20.dp))

        // Sign Up Button
        Button(
            onClick = { navController.navigate("login_screen") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
                .height(48.dp),
            shape = RoundedCornerShape(0.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2C859A)
            )
        ) {
            Text(
                text = "SIGN UP",
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF222431))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Back button Image
        Image(
            painter = painterResource(id = android.R.drawable.ic_menu_revert),
            contentDescription = "Back",
            modifier = Modifier
                .size(50.dp)
                .offset(x = (-180).dp, y = (20).dp)
                .clickable {
                    navController.popBackStack() // Navigate back to the previous screen
                },
            colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color(0xFF5ED9F6))
        )

        Spacer(modifier = Modifier.height(30.dp))

        // Eye icon Image
        Image(
            painter = painterResource(id = android.R.drawable.ic_menu_view),
            contentDescription = null,
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth(),
            colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(Color(0xFF5ED9F6))
        )

        Spacer(modifier = Modifier.height(50.dp))

        // Email TextField
        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
                .height(48.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedTextColor = Color(0xFF2C859A),
                unfocusedTextColor = Color(0xFF2C859A),
                containerColor = Color.Transparent,
                focusedIndicatorColor = Color(0xFF2C859A),
                unfocusedIndicatorColor = Color(0xFF2C859A),
                cursorColor = Color(0xFF2C859A)
            ),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Password TextField
        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
                .height(48.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedTextColor = Color(0xFF2C859A),
                unfocusedTextColor = Color(0xFF2C859A),
                containerColor = Color.Transparent,
                focusedIndicatorColor = Color(0xFF2C859A),
                unfocusedIndicatorColor = Color(0xFF2C859A),
                cursorColor = Color(0xFF2C859A)
            ),
            visualTransformation = PasswordVisualTransformation(),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Login Button
        Button(
            onClick = { navController.navigate("question_1_screen") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2C859A))
        ) {
            Text(
                text = "LOGIN",
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = FontFamily.Monospace
            )
        }
    }
}

@Composable
fun Question1(navController: NavController) {
    val context = LocalContext.current
    val userAnswer = remember { mutableStateOf(0) }
    val updateScore = remember { mutableStateOf(0) }

    AndroidView(
        factory = { context ->
            val layoutViewer = LayoutInflater.from(context).inflate(R.layout.question_1, null)

            val userScore: TextView = layoutViewer.findViewById(R.id.textView4)
            val choiceAnswer: RadioButton = layoutViewer.findViewById(R.id.answerChoice)
            val confirmButton: Button = layoutViewer.findViewById(R.id.button01Confirm)

            // Initialize user score
            userScore.text = "\$${userAnswer.value}"

            // Handle button click
            confirmButton.setOnClickListener {
                if (choiceAnswer.isChecked) {
                    val newScore = userAnswer.value + 100
                    updateScore.value = newScore
                    userScore.text = "\$${userAnswer.value}"
                    Toast.makeText(context, "Correct!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Incorrect!", Toast.LENGTH_SHORT).show()
                }
                navController.navigate("question_2_screen")
            }

            layoutViewer
        },
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun Question2(navController: NavController) {
    val context = LocalContext.current
    val userAnswer = remember { mutableStateOf(0) }
    val updateScore = remember { mutableStateOf(0) }

    AndroidView(
        factory = { context ->
            val layoutViewer = LayoutInflater.from(context).inflate(R.layout.question_2, null)

            val userScore: TextView = layoutViewer.findViewById(R.id.textView4)
            val choiceAnswer: RadioButton = layoutViewer.findViewById(R.id.answer02Choice)
            val confirmButton: Button = layoutViewer.findViewById(R.id.button02Confirm)

            userScore.text = "\$${userAnswer.value}"

            confirmButton.setOnClickListener {
                if (choiceAnswer.isChecked) {
                    userAnswer.value += 100
                    userScore.text = "\$${userAnswer.value}"
                    Toast.makeText(context, "Correct!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Incorrect!", Toast.LENGTH_SHORT).show()
                }
                navController.navigate("question_3_screen")
            }

            layoutViewer
        },
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun Question3(navController: NavController) {
    val context = LocalContext.current
    val userAnswer = remember { mutableStateOf(0) }
    val updateScore = remember { mutableStateOf(0) }
    AndroidView(
        factory = { context ->
            val layoutViewer = LayoutInflater.from(context).inflate(R.layout.question_3, null)

            val userScore: TextView = layoutViewer.findViewById(R.id.textView4)
            val choiceAnswer: RadioButton = layoutViewer.findViewById(R.id.choice03Answer)
            val confirmButton: Button = layoutViewer.findViewById(R.id.button03Confirm)

            userScore.text = "\$${userAnswer.value}"

            confirmButton.setOnClickListener {
                if (choiceAnswer.isChecked) {
                    userAnswer.value += 100
                    userScore.text = "\$${userAnswer.value}"
                    Toast.makeText(context, "Correct!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Incorrect!", Toast.LENGTH_SHORT).show()
                }
                navController.navigate("question_4_screen")
            }

            layoutViewer
        },
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun Question4(navController: NavController) {
    val context = LocalContext.current
    val userAnswer = remember { mutableStateOf(0) }
    val updateScore = remember { mutableStateOf(0) }

    AndroidView(
        factory = { context ->
            val layoutViewer = LayoutInflater.from(context).inflate(R.layout.question_4, null)

            val userScore: TextView = layoutViewer.findViewById(R.id.textView4)
            val choiceAnswer: RadioButton = layoutViewer.findViewById(R.id.choice04Answer)
            val confirmButton: Button = layoutViewer.findViewById(R.id.button04Confirm)

            userScore.text = "\$${userAnswer.value}"

            confirmButton.setOnClickListener {
                if (choiceAnswer.isChecked) {
                    userAnswer.value += 100
                    userScore.text = "\$${userAnswer.value}"
                    Toast.makeText(context, "Correct!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Incorrect!", Toast.LENGTH_SHORT).show()
                }
                navController.navigate("question_5_screen")
            }

            layoutViewer
        },
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun Question5(navController: NavController) {
    val context = LocalContext.current
    val userAnswer = remember { mutableStateOf(0) }
    val updateScore = remember { mutableStateOf(0) }

    AndroidView(
        factory = { context ->
    val layoutViewer = LayoutInflater.from(context).inflate(R.layout.question_5, null)

    val userScore: TextView = layoutViewer.findViewById(R.id.textView4)
    val choiceAnswer: RadioButton = layoutViewer.findViewById(R.id.choice05Answer)
    val confirmButton: Button = layoutViewer.findViewById(R.id.button05Confirm)

    userScore.text = "\$${userAnswer.value}"

    confirmButton.setOnClickListener {
        if (choiceAnswer.isChecked) {
            userAnswer.value += 100
            userScore.text = "\$${userAnswer.value}"
            Toast.makeText(context, "Correct!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "Incorrect!", Toast.LENGTH_SHORT).show()
        }
        navController.navigate("question_6_screen")
    }

    layoutViewer
},
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun Question6(navController: NavController) {
    val context = LocalContext.current
    val userAnswer = remember { mutableStateOf(0) }
    val updateScore = remember { mutableStateOf(0) }
    AndroidView(
        factory = { context ->
            val layoutViewer = LayoutInflater.from(context).inflate(R.layout.question_6, null)

            val userScore: TextView = layoutViewer.findViewById(R.id.textView4)
            val choiceAnswer: RadioButton = layoutViewer.findViewById(R.id.choice06Answer)
            val confirmButton: Button = layoutViewer.findViewById(R.id.button06Confirm)

            userScore.text = "\$${userAnswer.value}"

            confirmButton.setOnClickListener {
                if (choiceAnswer.isChecked) {
                    userAnswer.value += 100
                    userScore.text = "\$${userAnswer.value}"
                    Toast.makeText(context, "Correct!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Incorrect!", Toast.LENGTH_SHORT).show()
                }
                navController.navigate("question_7_screen")
            }

            layoutViewer
        },
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun Question7(navController: NavController) {
    val context = LocalContext.current
    val userAnswer = remember { mutableStateOf(0) }
    val updateScore = remember { mutableStateOf(0) }
    AndroidView(
        factory = { context ->
            val layoutViewer = LayoutInflater.from(context).inflate(R.layout.question_7, null)

            val userScore: TextView = layoutViewer.findViewById(R.id.textView4)
            val choiceAnswer: RadioButton = layoutViewer.findViewById(R.id.choice07Answer)
            val confirmButton: Button = layoutViewer.findViewById(R.id.button07Confirm)

            userScore.text = "\$${userAnswer.value}"

            confirmButton.setOnClickListener {
                if (choiceAnswer.isChecked) {
                    userAnswer.value += 100
                    userScore.text = "\$${userAnswer.value}"
                    Toast.makeText(context, "Correct!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Incorrect!", Toast.LENGTH_SHORT).show()
                }
                navController.navigate("stats_screen")
            }

            layoutViewer
        },
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun Statistics(navController: NavController) {
    val context = LocalContext.current
    val userAnswer = remember { mutableStateOf(0) }
    val updateScore = remember { mutableStateOf(0) }
    AndroidView(
        factory = { context ->
            val layoutViewer = LayoutInflater.from(context).inflate(R.layout.statistics, null)

            val playAgainButton: Button = layoutViewer.findViewById(R.id.buttonPlayAgain)
            val correctAmount: TextView = layoutViewer.findViewById(R.id.correctTextView)
            val earningsAmount: TextView = layoutViewer.findViewById(R.id.earningsTextView)

            earningsAmount.text = "$" + userAnswer.toString()
            val correctAnswers = (userAnswer.value / 100).toInt()
            correctAmount.text = "$correctAnswers/7"


            playAgainButton.setOnClickListener {
                userAnswer.value = 0;
                navController.navigate("question_1_screen")
            }
            layoutViewer
        },
        modifier = Modifier.fillMaxSize()
    )
}


