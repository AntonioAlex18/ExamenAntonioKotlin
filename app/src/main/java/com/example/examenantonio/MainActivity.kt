package com.example.examenantonio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examenantonio.ui.theme.EXAMENANTONIOTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EXAMENANTONIOTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color.Gray
                ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var nombre1 by remember { mutableStateOf("") }
    var nombre2 by remember { mutableStateOf("") }
    var operateur by remember { mutableStateOf("") }
    var resultat by remember { mutableStateOf("") }
    var histo by remember { mutableStateOf(mutableListOf<String>()) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Gray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.End
    ) {
        Text(text = "$nombre1 $operateur $nombre2")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "$resultat")
        Spacer(modifier = Modifier.height(8.dp))

        Column(
            modifier = modifier.padding(15.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {

                            nombre1 = ""
                            nombre2 = ""
                            operateur = ""
                            resultat = ""

                    },
                    modifier = Modifier.weight(3f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
                ) {
                    Text(text = "AC")
                }
                Button(
                    onClick = {
                        if (operateur == "") {
                            operateur = "%"
                        } else {
                            operateur = "%"
                        }
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "%")
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {
                        if (nombre1 == "") {
                            nombre1 = "1"
                        } else {
                            nombre2 = "1"
                        }
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "1")
                }

                Button(
                    onClick = {
                        if (nombre1 == "") {
                            nombre1 = "2"
                        } else {
                            nombre2 = "2"
                        }
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "2")
                }

                Button(
                    onClick = {
                        if (nombre1 == "") {
                            nombre1 = "3"
                        } else {
                            nombre2 = "3"
                        }
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "3")
                }

                Button(
                    onClick = {
                        if (operateur == "") {
                            operateur = "/"
                        } else {
                            operateur = "/"
                        }
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "/")
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {
                        if (nombre1 == "") {
                            nombre1 = "4"
                        } else {
                            nombre2 = "4"
                        }
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "4")
                }

                Button(
                    onClick = {
                        if (nombre1 == "") {
                            nombre1 = "5"
                        } else {
                            nombre2 = "5"
                        }
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "5")
                }

                Button(
                    onClick = {
                        if (nombre1 == "") {
                            nombre1 = "6"
                        } else {
                            nombre2 = "6"
                        }
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "6")
                }

                Button(
                    onClick = {
                        if (operateur == "") {
                            operateur = "*"
                        } else {
                            operateur = "*"
                        }
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "*")
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {
                        if (nombre1 == "") {
                            nombre1 = "7"
                        } else {
                            nombre2 = "7"
                        }
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "7")
                }

                Button(
                    onClick = {
                        if (nombre1 == "") {
                            nombre1 = "8"
                        } else {
                            nombre2 = "8"
                        }
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "8")
                }

                Button(
                    onClick = {
                        if (nombre1 == "") {
                            nombre1 = "9"
                        } else {
                            nombre2 = "9"
                        }
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "9")
                }

                Button(
                    onClick = {
                        if (operateur == "") {
                            operateur = "+"
                        } else {
                            operateur = "+"
                        }
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "+")
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {
                        if (nombre1 == "") {
                            nombre1 = "0"
                        } else {
                            nombre2 = "0"
                        }
                    },
                    modifier = Modifier.weight(2f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "0")
                }

                Button(
                    onClick = {
                        if (nombre1 == "") {
                            nombre1 = "-"
                        } else {
                            nombre2 = "-"
                        }
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "-")
                }

                Button(
                    onClick = {
                        if (nombre1.isNotEmpty() || nombre2.isNotEmpty() || operateur.isNotEmpty()) {
                            if (operateur == "/") {
                                resultat = (nombre1.toInt() / nombre2.toInt()).toString()
                            } else if (operateur == "*") {
                                resultat = (nombre1.toInt() * nombre2.toInt()).toString()
                            } else if (operateur == "-") {
                                resultat = (nombre1.toInt() - nombre2.toInt()).toString()
                            } else if (operateur == "+") {
                                resultat = (nombre1.toInt() + nombre2.toInt()).toString()
                            } else if (operateur == "%") {
                                resultat = (nombre1.toInt() % nombre2.toInt()).toString()
                            }
                        }
                        histo.add("$resultat")
                        nombre1 = ""
                        nombre2 = ""
                        operateur = ""
                    },
                    modifier = Modifier.weight(1f).padding(2.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(text = "=")
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 60.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Text(text = "Historique : ")
                histo.forEach { resultat ->
                    Text(text = "$resultat , ")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EXAMENANTONIOTheme {
        Greeting(name = "Android")
    }
}
