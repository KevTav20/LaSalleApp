package com.example.lasalleapp.ui.utils

import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import com.example.lasalleapp.models.BottomNavigationItem
import com.example.lasalleapp.models.Community
import com.example.lasalleapp.models.News
import com.example.lasalleapp.models.Settings
import com.example.lasalleapp.models.Student
import com.example.lasalleapp.models.Subject
import com.example.lasalleapp.models.Tuition
import java.time.LocalDate

val newsList = listOf(
    News(
        id = 1,
        title = "Evento de Construcción de la Paz",
        description = "La Salle Bajío realiza un foro para fomentar la construcción de la paz en la comunidad estudiantil.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_1.jpg"
    ), News(
        id = 2,
        title = "Conferencia de Liderazgo",
        description = "Una conferencia que destaca la importancia del liderazgo en la comunidad universitaria.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_2.jpg"
    ), News(
        id = 3,
        title = "Semana Cultural 2024",
        description = "Celebración anual de la Semana Cultural con diversas actividades artísticas y deportivas.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_3.jpg"
    )
)

val bottomNavBarItems = listOf(
    BottomNavigationItem(
        title = "Inicio", icon = Icons.Default.Home, route = Screens.Home.route
    ), BottomNavigationItem(
        title = "Calificaciones", icon = Icons.Default.Menu, route = Screens.Grades.route
    ), BottomNavigationItem(
        title = "Calendario", icon = Icons.Default.DateRange, route = Screens.Calendar.route
    ), BottomNavigationItem(
        title = "Configuracion", icon = Icons.Default.Settings, route = Screens.Settings.route
    )
)

val communities = listOf(
    Community(
        1, "https://www.lasallebajio.edu.mx/comunidad/images/tile_documentos_inspiradores.jpg"
    ),
    Community(2, "https://www.lasallebajio.edu.mx/comunidad/images/tile_boletin.jpg"),
    Community(3, "https://www.lasallebajio.edu.mx/comunidad/images/tile_cat_souv_22.jpg "),
    Community(4, "https://www.lasallebajio.edu.mx/comunidad/images/tile_tramites.jpg"),
    Community(5, "https://www.lasallebajio.edu.mx/comunidad/images/tile_blog.jpg"),
)

val subjectList = listOf(
    Subject(id = 1, subjectName = "Math", partialGrades = listOf()),
    Subject(id = 2, subjectName = "Physics", partialGrades = listOf()),
    Subject(id = 3, subjectName = "Chemistry", partialGrades = listOf()),
    Subject(id = 4, subjectName = "Biology", partialGrades = listOf()),
    Subject(id = 5, subjectName = "History", partialGrades = listOf()),
    Subject(id = 6, subjectName = "Data Structures", partialGrades = listOf()),
    Subject(id = 7, subjectName = "Algorithms", partialGrades = listOf()),
    Subject(id = 8, subjectName = "Database Systems", partialGrades = listOf()),
    Subject(id = 9, subjectName = "Operating Systems", partialGrades = listOf()),
    Subject(id = 10, subjectName = "Computer Networks", partialGrades = listOf()),
    Subject(id = 11, subjectName = "Software Engineering", partialGrades = listOf()),
    Subject(id = 12, subjectName = "Discrete Mathematics", partialGrades = listOf()),
    Subject(id = 13, subjectName = "Compiler Design", partialGrades = listOf()),
    Subject(id = 14, subjectName = "Artificial Intelligence", partialGrades = listOf()),
    Subject(id = 15, subjectName = "Machine Learning", partialGrades = listOf()),
    Subject(id = 16, subjectName = "Deep Learning", partialGrades = listOf()),
    Subject(id = 17, subjectName = "Web Development", partialGrades = listOf()),
    Subject(id = 18, subjectName = "Mobile App Development", partialGrades = listOf()),
    Subject(id = 19, subjectName = "Cloud Computing", partialGrades = listOf()),
    Subject(id = 20, subjectName = "Quantum Computing", partialGrades = listOf()),
    Subject(id = 21, subjectName = "Cybersecurity", partialGrades = listOf()),
    Subject(id = 22, subjectName = "Human-Computer Interaction", partialGrades = listOf()),
    Subject(id = 23, subjectName = "Parallel Computing", partialGrades = listOf()),
    Subject(id = 24, subjectName = "Computer Graphics", partialGrades = listOf()),
    Subject(id = 25, subjectName = "Game Development", partialGrades = listOf()),
    Subject(id = 26, subjectName = "Blockchain Technology", partialGrades = listOf()),
    Subject(id = 27, subjectName = "Software Testing", partialGrades = listOf()),
    Subject(id = 28, subjectName = "DevOps", partialGrades = listOf()),
    Subject(id = 29, subjectName = "Big Data", partialGrades = listOf()),
    Subject(id = 30, subjectName = "Natural Language Processing", partialGrades = listOf()),
    Subject(id = 31, subjectName = "Augmented Reality", partialGrades = listOf()),
    Subject(id = 32, subjectName = "Virtual Reality", partialGrades = listOf()),
    Subject(id = 33, subjectName = "Ethical Hacking", partialGrades = listOf()),
    Subject(id = 34, subjectName = "Internet of Things", partialGrades = listOf()),
    Subject(id = 35, subjectName = "Software Architecture", partialGrades = listOf())
)

val settingsList = listOf(
    Settings(
        id = 1, icon = UserRoundPen, option = "Editar perfil"
    ),
    Settings(
        id = 2, icon = Passkey, option = "Cambiar contraseña"
    ),
    Settings(
        id = 3, icon = Notifications, option = "Notificaciones"
    ),
    Settings(
        id = 4, icon = MoonStars, option = "Cambiar tema"
    ),
    Settings(
        id = 5, icon = Languages, option = "Idioma"
    ),
    Settings(
        id = 6, icon = Help, option = "Soporte"
    ),
    Settings(
        id = 7, icon = Logout, option = "Cerrar Sesion"
    ),
)
val studentsList = listOf(
    Student(
        id = 1,
        fullName = "Alice Johnson",
        dateOfBirth = "2001-01-10",
        institutionalEmail = "alice.johnson@university.edu",
        career = "ISSC",
        imageUrl = "https://imgur.com/8jnXixi.jpg",
        password = "alice123",
        currentSemester = "1",
        subjects = listOf(
            Subject(id = 1, subjectName = "Math", partialGrades = listOf(8.0f, 9.0f, 7.5f)),
            Subject(id = 2, subjectName = "Physics", partialGrades = listOf(7.0f, 8.5f, 9.0f)),
            Subject(id = 3, subjectName = "Chemistry", partialGrades = listOf(9.5f, 8.5f, 10f)),
            Subject(id = 4, subjectName = "Biology", partialGrades = listOf(7.5f, 8.0f, 7.0f)),
            Subject(id = 5, subjectName = "History", partialGrades = listOf(8.0f, 9.5f, 9.0f)),
            Subject(
                id = 6, subjectName = "Data Structures", partialGrades = listOf(7.5f, 8.0f, 8.5f)
            ),
            Subject(id = 7, subjectName = "Algorithms", partialGrades = listOf(9.0f, 9.5f, 8.5f))
        ),
        pastSemesters = listOf(0f),
        tution = listOf(
            // Primer grupo de 5 estudiantes (Periodo AGO-DIC 2024)
            Tuition(
                1,
                "PRIMER PAGO",
                "agosto 16 de 2024",
                "57 - AGO-DIC 2024",
                15000,
                true,
                "CPAL00020769"
            ),
            Tuition(
                2,
                "SEGUNDO PAGO",
                "septiembre 16 de 2024",
                "57 - AGO-DIC 2024",
                15000,
                false,
                "CPAL00020770"
            ),
            Tuition(
                3,
                "TERCER PAGO",
                "octubre 16 de 2024",
                "57 - AGO-DIC 2024",
                15000,
                false,
                "CPAL00020771"
            ),
            Tuition(
                4,
                "CUARTO PAGO DE COLEGIATURA",
                "noviembre 16 de 2024",
                "57 - AGO-DIC 2024",
                15000,
                true,
                "CPAL00020772"
            ),
            Tuition(
                5,
                "QUINTO PAGO DE COLEGIATURA",
                "diciembre 16 de 2024",
                "57 - AGO-DIC 2024",
                15000,
                true,
                "CPAL00020773"
            ),
        )
    ), Student(
        id = 2,
        fullName = "Bob Smith",
        dateOfBirth = "2000-03-22",
        institutionalEmail = "bob.smith@university.edu",
        career = "ISSC",
        imageUrl = "https://imgur.com/M96Bm53.jpg",
        password = "bob456",
        currentSemester = "2",
        subjects = listOf(
            Subject(
                id = 8, subjectName = "Database Systems", partialGrades = listOf(8.5f, 9.0f, 8.0f)
            ), Subject(
                id = 9, subjectName = "Operating Systems", partialGrades = listOf(9.5f, 9.0f, 8.5f)
            ), Subject(
                id = 10, subjectName = "Computer Networks", partialGrades = listOf(8.0f, 8.5f, 7.5f)
            ), Subject(
                id = 11,
                subjectName = "Software Engineering",
                partialGrades = listOf(9.0f, 8.0f, 9.5f)
            ), Subject(
                id = 12,
                subjectName = "Discrete Mathematics",
                partialGrades = listOf(7.5f, 8.5f, 9.0f)
            ), Subject(
                id = 13, subjectName = "Compiler Design", partialGrades = listOf(9.5f, 9.0f, 8.5f)
            ), Subject(
                id = 14,
                subjectName = "Artificial Intelligence",
                partialGrades = listOf(9.0f, 9.5f, 9.0f)
            )
        ),
        pastSemesters = listOf(9.7f),
        tution = listOf(
            Tuition(
                6,
                "PRIMER PAGO",
                "enero 16 de 2025",
                "58 - ENE-JUN 2025",
                15000,
                false,
                "CPAL00020774"
            ),
            Tuition(
                7,
                "SEGUNDO PAGO",
                "febrero 16 de 2025",
                "58 - ENE-JUN 2025",
                15000,
                true,
                "CPAL00020775"
            ),
            Tuition(
                8,
                "TERCER PAGO",
                "marzo 16 de 2025",
                "58 - ENE-JUN 2025",
                15000,
                false,
                "CPAL00020776"
            ),
            Tuition(
                9,
                "CUARTO PAGO",
                "abril 16 de 2025",
                "58 - ENE-JUN 2025",
                15000,
                true,
                "CPAL00020777"
            ),
            Tuition(
                10,
                "QUINTO PAGO",
                "mayo 16 de 2025",
                "58 - ENE-JUN 2025",
                15000,
                true,
                "CPAL00020778"
            ),
        )
    ), Student(
        id = 3,
        fullName = "Charlie Brown",
        dateOfBirth = "1999-05-18",
        institutionalEmail = "charlie.brown@university.edu",
        career = "ISSC",
        imageUrl = "https://imgur.com/DenWeik.jpg",
        password = "charlie789",
        currentSemester = "3",
        subjects = listOf(
            Subject(
                id = 15, subjectName = "Machine Learning", partialGrades = listOf(8.0f, 8.5f, 9.0f)
            ), Subject(
                id = 16, subjectName = "Deep Learning", partialGrades = listOf(9.5f, 9.0f, 8.5f)
            ), Subject(
                id = 17, subjectName = "Web Development", partialGrades = listOf(9.0f, 8.0f, 9.5f)
            ), Subject(
                id = 18,
                subjectName = "Mobile App Development",
                partialGrades = listOf(8.0f, 7.5f, 8.5f)
            ), Subject(
                id = 19, subjectName = "Cloud Computing", partialGrades = listOf(9.0f, 9.5f, 8.0f)
            ), Subject(
                id = 20, subjectName = "Quantum Computing", partialGrades = listOf(8.5f, 9.0f, 8.5f)
            ), Subject(
                id = 21, subjectName = "Cybersecurity", partialGrades = listOf(9.0f, 8.5f, 9.5f)
            )
        ),
        pastSemesters = listOf(8.4f, 1.5f),
        tution = listOf(
            Tuition(
                11,
                "PRIMER PAGO",
                "agosto 16 de 2025",
                "59 - AGO-DIC 2025",
                15000,
                true,
                "CPAL00020779"
            ),
            Tuition(
                12,
                "SEGUNDO PAGO",
                "septiembre 16 de 2025",
                "59 - AGO-DIC 2025",
                15000,
                false,
                "CPAL00020780"
            ),
            Tuition(
                13,
                "TERCER PAGO",
                "octubre 16 de 2025",
                "59 - AGO-DIC 2025",
                15000,
                true,
                "CPAL00020781"
            ),
            Tuition(
                14,
                "CUARTO PAGO",
                "noviembre 16 de 2025",
                "59 - AGO-DIC 2025",
                15000,
                true,
                "CPAL00020782"
            ),
            Tuition(
                15,
                "QUINTO PAGO",
                "diciembre 16 de 2025",
                "59 - AGO-DIC 2025",
                15000,
                false,
                "CPAL00020783"
            ),
        )
    ), Student(
        id = 4,
        fullName = "Diana Prince",
        dateOfBirth = "2002-07-09",
        institutionalEmail = "diana.prince@university.edu",
        career = "ISSC",
        imageUrl = "https://imgur.com/uC8PARb.jpg",
        password = "diana1011",
        currentSemester = "4",
        subjects = listOf(
            Subject(
                id = 22,
                subjectName = "Human-Computer Interaction",
                partialGrades = listOf(9.0f, 8.5f, 9.0f)
            ), Subject(
                id = 23,
                subjectName = "Parallel Computing",
                partialGrades = listOf(9.5f, 9.0f, 9.0f)
            ), Subject(
                id = 24, subjectName = "Computer Graphics", partialGrades = listOf(8.5f, 9.0f, 9.5f)
            ), Subject(
                id = 25, subjectName = "Game Development", partialGrades = listOf(9.0f, 8.5f, 8.0f)
            ), Subject(
                id = 26,
                subjectName = "Blockchain Technology",
                partialGrades = listOf(8.5f, 8.0f, 9.5f)
            ), Subject(
                id = 27, subjectName = "Software Testing", partialGrades = listOf(9.0f, 9.5f, 8.5f)
            ), Subject(id = 28, subjectName = "DevOps", partialGrades = listOf(9.0f, 8.0f, 9.5f))
        ),
        pastSemesters = listOf(10f, 7.5f, 9.7f),
        tution = listOf(
            Tuition(
                16,
                "PRIMER PAGO",
                "enero 16 de 2026",
                "60 - ENE-JUN 2026",
                15000,
                true,
                "CPAL00020784"
            ),
            Tuition(
                17,
                "SEGUNDO PAGO",
                "febrero 16 de 2026",
                "60 - ENE-JUN 2026",
                15000,
                true,
                "CPAL00020785"
            ),
            Tuition(
                18,
                "TERCER PAGO",
                "marzo 16 de 2026",
                "60 - ENE-JUN 2026",
                15000,
                true,
                "CPAL00020786"
            ),
            Tuition(
                19,
                "CUARTO PAGO",
                "abril 16 de 2026",
                "60 - ENE-JUN 2026",
                15000,
                false,
                "CPAL00020787"
            ),
            Tuition(
                20,
                "QUINTO PAGO",
                "mayo 16 de 2026",
                "60 - ENE-JUN 2026",
                15000,
                false,
                "CPAL00020788"
            ),
        )
    ), Student(
        id = 5,
        fullName = "Eve Adams",
        dateOfBirth = "2001-09-25",
        institutionalEmail = "eve.adams@university.edu",
        career = "ISSC",
        imageUrl = "https://imgur.com/d138C8t.jpg",
        password = "eve1213",
        currentSemester = "5",
        subjects = listOf(
            Subject(id = 29, subjectName = "Big Data", partialGrades = listOf(8.0f, 9.0f, 8.5f)),
            Subject(
                id = 30,
                subjectName = "Natural Language Processing",
                partialGrades = listOf(9.5f, 9.0f, 8.0f)
            ),
            Subject(
                id = 31, subjectName = "Augmented Reality", partialGrades = listOf(9.0f, 8.5f, 8.0f)
            ),
            Subject(
                id = 32, subjectName = "Virtual Reality", partialGrades = listOf(9.5f, 9.0f, 9.5f)
            ),
            Subject(
                id = 33, subjectName = "Ethical Hacking", partialGrades = listOf(8.0f, 8.5f, 8.0f)
            ),
            Subject(
                id = 34,
                subjectName = "Internet of Things",
                partialGrades = listOf(9.0f, 9.5f, 9.0f)
            ),
            Subject(
                id = 35,
                subjectName = "Software Architecture",
                partialGrades = listOf(9.5f, 9.0f, 9.0f)
            )
        ),
        pastSemesters = listOf(8.4f, 9.9f, 9.7f, 10f),
        tution = listOf(

            // Quinto grupo de 5 estudiantes (Periodo AGO-DIC 2026)
            Tuition(
                21,
                "PRIMER PAGO",
                "agosto 16 de 2026",
                "61 - AGO-DIC 2026",
                15000,
                false,
                "CPAL00020789"
            ),
            Tuition(
                22,
                "SEGUNDO PAGO",
                "septiembre 16 de 2026",
                "61 - AGO-DIC 2026",
                15000,
                true,
                "CPAL00020790"
            ),
            Tuition(
                23,
                "TERCER PAGO",
                "octubre 16 de 2026",
                "61 - AGO-DIC 2026",
                15000,
                true,
                "CPAL00020791"
            ),
            Tuition(
                24,
                "CUARTO PAGO",
                "noviembre 16 de 2026",
                "61 - AGO-DIC 2026",
                15000,
                false,
                "CPAL00020792"
            ),
            Tuition(
                25,
                "QUINTO PAGO",
                "diciembre 16 de 2026",
                "61 - AGO-DIC 2026",
                15000,
                false,
                "CPAL00020793"
            ),
        )
    )
)

val tuitionList = listOf(
    // Primer grupo de 5 estudiantes (Periodo AGO-DIC 2024)
    Tuition(
        1,
        "PRIMER PAGO",
        "agosto 16 de 2024",
        "57 - AGO-DIC 2024",
        15000,
        true,
        "CPAL00020769"
    ), Tuition(
        2,
        "SEGUNDO PAGO",
        "septiembre 16 de 2024",
        "57 - AGO-DIC 2024",
        15000,
        true,
        "CPAL00020770"
    ), Tuition(
        3,
        "TERCER PAGO",
        "octubre 16 de 2024",
        "57 - AGO-DIC 2024",
        15000,
        true,
        "CPAL00020771"
    ), Tuition(
        4,
        "CUARTO PAGO",
        "noviembre 16 de 2024",
        "57 - AGO-DIC 2024",
        15000,
        true,
        "CPAL00020772"
    ), Tuition(
        5,
        "QUINTO PAGO",
        "diciembre 16 de 2024",
        "57 - AGO-DIC 2024",
        15000,
        true,
        "CPAL00020773"
    ),

    // Segundo grupo de 5 estudiantes (Periodo ENE-JUN 2025)
    Tuition(
        6,
        "PRIMER PAGO",
        "enero 16 de 2025",
        "58 - ENE-JUN 2025",
        15000,
        true,
        "CPAL00020774"
    ), Tuition(
        7,
        "SEGUNDO PAGO",
        "febrero 16 de 2025",
        "58 - ENE-JUN 2025",
        15000,
        true,
        "CPAL00020775"
    ), Tuition(
        8,
        "TERCER PAGO",
        "marzo 16 de 2025",
        "58 - ENE-JUN 2025",
        15000,
        true,
        "CPAL00020776"
    ), Tuition(
        9,
        "CUARTO PAGO",
        "abril 16 de 2025",
        "58 - ENE-JUN 2025",
        15000,
        true,
        "CPAL00020777"
    ), Tuition(
        10,
        "QUINTO PAGO",
        "mayo 16 de 2025",
        "58 - ENE-JUN 2025",
        15000,
        true,
        "CPAL00020778"
    ),

    // Tercer grupo de 5 estudiantes (Periodo AGO-DIC 2025)
    Tuition(
        11,
        "PRIMER PAGO",
        "agosto 16 de 2025",
        "59 - AGO-DIC 2025",
        15000,
        true,
        "CPAL00020779"
    ), Tuition(
        12,
        "SEGUNDO PAGO",
        "septiembre 16 de 2025",
        "59 - AGO-DIC 2025",
        15000,
        true,
        "CPAL00020780"
    ), Tuition(
        13,
        "TERCER PAGO",
        "octubre 16 de 2025",
        "59 - AGO-DIC 2025",
        15000,
        true,
        "CPAL00020781"
    ), Tuition(
        14,
        "CUARTO PAGO",
        "noviembre 16 de 2025",
        "59 - AGO-DIC 2025",
        15000,
        true,
        "CPAL00020782"
    ), Tuition(
        15,
        "QUINTO PAGO",
        "diciembre 16 de 2025",
        "59 - AGO-DIC 2025",
        15000,
        true,
        "CPAL00020783"
    ),

    // Cuarto grupo de 5 estudiantes (Periodo ENE-JUN 2026)
    Tuition(
        16,
        "PRIMER PAGO",
        "enero 16 de 2026",
        "60 - ENE-JUN 2026",
        15000,
        true,
        "CPAL00020784"
    ), Tuition(
        17,
        "SEGUNDO PAGO",
        "febrero 16 de 2026",
        "60 - ENE-JUN 2026",
        15000,
        true,
        "CPAL00020785"
    ), Tuition(
        18,
        "TERCER PAGO",
        "marzo 16 de 2026",
        "60 - ENE-JUN 2026",
        15000,
        true,
        "CPAL00020786"
    ), Tuition(
        19,
        "CUARTO PAGO",
        "abril 16 de 2026",
        "60 - ENE-JUN 2026",
        15000,
        true,
        "CPAL00020787"
    ), Tuition(
        20,
        "QUINTO PAGO",
        "mayo 16 de 2026",
        "60 - ENE-JUN 2026",
        15000,
        true,
        "CPAL00020788"
    ),

    // Quinto grupo de 5 estudiantes (Periodo AGO-DIC 2026)
    Tuition(
        21,
        "PRIMER PAGO",
        "agosto 16 de 2026",
        "61 - AGO-DIC 2026",
        15000,
        true,
        "CPAL00020789"
    ), Tuition(
        22,
        "SEGUNDO PAGO",
        "septiembre 16 de 2026",
        "61 - AGO-DIC 2026",
        15000,
        true,
        "CPAL00020790"
    ), Tuition(
        23,
        "TERCER PAGO",
        "octubre 16 de 2026",
        "61 - AGO-DIC 2026",
        15000,
        true,
        "CPAL00020791"
    ), Tuition(
        24,
        "CUARTO PAGO",
        "noviembre 16 de 2026",
        "61 - AGO-DIC 2026",
        15000,
        true,
        "CPAL00020792"
    ), Tuition(
        25,
        "QUINTO PAGO",
        "diciembre 16 de 2026",
        "61 - AGO-DIC 2026",
        15000,
        true,
        "CPAL00020793"
    ),

    // Sexto grupo de 5 estudiantes (Periodo ENE-JUN 2027)
    Tuition(
        26,
        "PRIMER PAGO",
        "enero 16 de 2027",
        "62 - ENE-JUN 2027",
        15000,
        true,
        "CPAL00020794"
    ), Tuition(
        27,
        "SEGUNDO PAGO",
        "febrero 16 de 2027",
        "62 - ENE-JUN 2027",
        15000,
        true,
        "CPAL00020795"
    ), Tuition(
        28,
        "TERCER PAGO",
        "marzo 16 de 2027",
        "62 - ENE-JUN 2027",
        15000,
        true,
        "CPAL00020796"
    ), Tuition(
        29,
        "CUARTO PAGO",
        "abril 16 de 2027",
        "62 - ENE-JUN 2027",
        15000,
        true,
        "CPAL00020797"
    ), Tuition(
        30,
        "QUINTO PAGO",
        "mayo 16 de 2027",
        "62 - ENE-JUN 2027",
        15000,
        true,
        "CPAL00020798"
    )
)