package com.example.myhistoryapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize user interface elements
        val ageNum: EditText = findViewById(R.id.ageNum)
        val subBtn: Button = findViewById(R.id.subBtn)
        val result = findViewById<TextView>(R.id.result)
        val clearBtn: Button = findViewById(R.id.clearBtn)

        // Set click listener for submit button
        subBtn.setOnClickListener {
            val ageText = ageNum.text.toString()
            val age = ageText.toIntOrNull()
            if (age != null) {
                val userAge = when (age) {

                    in 20..24-> "you are around the age of:\n\n Pop Smoke (1999-2020)  \n\n an American rapper \n\n Bashar Barakah Jackson, known professionally as Pop Smoke, was an American rapper. " +
                            "Born and raised in Brooklyn, New York City, he rose to fame with the release of his breakout singles \"Welcome to the Party\" and \"Dior\" in 2019"

                    in 25..29 -> "you are around the age of:\n\n The Notorious B.I.G.(1972-1997 \n\n American rapper\n\n Christopher George Latore Wallace, better known by his stage names The Notorious B.I.G., Biggie Smalls, or simply Biggie, was an American rapper." +
                            " Rooted in East Coast hip hop and particularly gangsta rap, he is widely considered one of the greatest rappers of all time."

                    in 30..34 -> "you are around the age of:\n\n Alexander the Great (356 BC–323 BC)\n\n" +
                            "King of Macedonia\n\n When the son of Philip II of Macedon inherited the throne in 336 BC, " +
                            "he set about reasserting Macedonian authority in Greece, aiming to conquer the Persian empire. By the time of his death in Babylon at the age of 32," +
                            " Alexander had created an empire that spanned three continents and covered around 2 million square miles. Commenting on what makes Alexander the Great such a ‘great’ leader, " +
                            "historian Professor Paul Cartledge said: “He combined immense personal charisma and bravery (he often led his troops from the front)." +
                            "Plus he had a priceless ability to identify the key moment in a battle and act decisively to ensure he won that moment.”"

                    in 35..39 -> "you are around the age of:\n " +
                            "\n Martin Luther King (1929–68)\n \nIn 1956,Baptist preacher Martin Luther King became a leading figure in organising the boycott by African-Americans of buses in Montgomery, " +
                            "Alabama in support of Rosa Parks, who had been arrested for refusing to give up her seat to a white man. King was a major figure in the US civil rights movement," +
                            " leading non-violent protests and playing a pivotal role in the ending of the legal segregation of African-American citizens in the US. " +
                            "He received the Nobel Peace Prize in 1964 but was assassinated in Memphis on 4 April 1968. The US civil rights marches of 1965 were the focus of the 2014 film Selma."

                    in 40..44 -> "you are around the age of:\n\n Paul Walker (1973-2013)\n\n Computer scientist and cryptanalyst \n\n American actor\n\n Paul William Walker IV was an American actor. He was best known for his role as Brian O'Conner in the Fast & Furious franchise."

                    in 45..49 -> "you are around the age of:\n\n John F Kennedy (1917–63)\n\n 35th US president \n\n John F Kennedy – also known as Jack or JFK – was the 35th president of the United States. Elected in 1960, he was assassinated in 1963 in Dallas, Texas. " +
                            "Lee Harvey Oswald was charged with the murder but was himself killed before he could stand trial. JFK’s presidency witnessed serious confrontations with the USSR, leading to the Bay of Pigs invasion and the Cuban missile crisis." +
                            "Kennedy served in the US navy in the Second World War. He was married to Jacqueline Bouvier."

                    in 50..54 -> "you are around the age of:\n\n Michael Jackson (1958-2009)\n\n Michael Joseph Jackson was an American singer, songwriter, dancer, and philanthropist. " +
                            "Known as the King of Pop, he is regarded as one of the most significant cultural figures of the 20th century."

                    in 55..59 -> "you are around the age of:\n\n Abraham Lincoln (1809–65)\n\n 16th US president and opponent of slavery Abraham Lincoln, who became the 16th US president in 1861," +
                            " led the Union to victory in the American Civil War of 1861–65 and introduced the 13th Amendment of 1865, which abolished slavery in the US. " +
                            "But although he managed to prevent the fragmentation of the country, Lincoln saw only six weeks of peace during his tenure and was assassinated in April 1865."

                    in 60..64 -> "you are around the age of:\n\n Franklin D Roosevelt (1882–1945)\n\n 32nd US president \n\n The 32nd (and longest-serving) US president, Franklin D Roosevelt took office in 1933 during the Great Depression. He served four terms in the White House, and saw the US through the Second World War, as well as playing a key role in developing the United Nations."

                    in 65..69 -> "you are around the age of:\n\n Leonardo da Vinci (1452–1519)\n\n The illegitimate son of a Tuscan lawyer, Leonardo da Vinci became one of the most influential artists, sculptors, engineers, scientists and inventors of the Renaissance. " +
                            "           The parachute and the helicopter are just two of many inventions credited to the Italian genius, while his painting known as Mona Lisa remains one of the most recognisable, and reproduced, portraits in the world."

                    in 70..74 -> "you are around the age of:\n\n Charles Darwin (1809–82)\n\n British naturalist, geologist and biologist \n\n Darwin’s theory of evolution by natural selection – that the varying survival of individual organisms with different characteristics in specific environments results in the promotion of those traits – brought him into conflict with the Anglican church." +
                            " His groundbreaking work The Origin of Species was published in 1859, provoking outrage among creationists. But his 1871 Descent of Man caused even more controversy with its claims that humans and apes were descended from a common ancestor."

                    in 75..79 -> "you are around the age of:\n" +
                            " \n Albert Einstein (1879–1955): \n \n German-born theoretical physicist \n\n Theoretical physicist Albert Einstein is perhaps best known for his pioneering theory of general relativity." +
                            " His work established new ideas about the formation of the universe and black holes, revolutionising our knowledge of gravity, time and space."

                    in 80..84 -> "you are around the age of: \n\n Isaac Newton (1643–1727)\n\n Mathematician, astronomer and physicist \n\n Recognised as one of the most influential physicists and mathematicians in history, " +
                            "Isaac Newton was key to the 18th-century scientific revolution. Among many achievements, his work laid the foundations for classical mechanics and calculus." +
                            " “There are always new stories to tell about the Briton who invented gravity and unwove the colours of the rainbow,” says historian Patricia Fara."

                    in 85..89 -> "you are around the age of: \n\n Nikola Tesla (1856–1943) \n\n Serbian-American inventor\n\n Inventor and engineer Nikola Tesla first travelled to America in 1884 with just four cents in his pocket and began working at Edison Machine Works improving DC generators. " +
                            "His invention of the induction motor that would work with alternating current (AC) is considered a milestone in modern electrical systems."

                    in 90..94 -> "you are around the age of: \n\n Winston Churchill (1874–1965) \n\n British wartime prime minister \n\n Voted the Greatest Briton in a 2002 BBC poll, storming home with just over 28 per cent of the votes, Churchill is remembered as the man who led Britain to victory during the Second World War. " +
                            "He was prime minister from 1940–45 and again from 1951–55, standing down as an MP in 1964 after a political career spanning more than six decades. Churchill’s speeches, delivered during some of Britain’s darkest days, are rated among the most rousing in history, but many of his strategic decisions – particularly the blanket bombing of German cities continue to divide opinion." +
                            " Churchill was also a talented artist and exhibited some 50 works at the British Academy. A keen writer, he was awarded the Nobel Prize in Literature in 1953 for, in the judges’ words, “his mastery of historical and biographical description as well as for brilliant oratory in defending exalted human values”."

                    in 95..100 -> "you are around the age of: \n\n Queen Elizabeth II (1926-2022) \n\n Former Queen of the United Kingdom \n\n Elizabeth II was Queen of the United Kingdom and other Commonwealth realms from 6 February 1952 until her death in 2022. She was queen regnant of 32 sovereign states over the course of her lifetime and remained the monarch of 15 realms by the time of her death."

                    else -> "Invalid: please enter age between 20 and 100."
                }

                result.text = userAge // Display results with corresponding age
            } else {
                result.text = getString(R.string.error)
            }
            // button to clear edittext and results
            clearBtn.setOnClickListener {
                ageNum.text.clear()
                result.text = ""
            }
        }
    }
}