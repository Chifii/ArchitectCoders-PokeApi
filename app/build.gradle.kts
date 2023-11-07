plugins {
	id("com.android.application")
	id("kotlin-android")
	id("io.gitlab.arturbosch.detekt")
	id("com.google.gms.google-services")
	id("org.jetbrains.kotlin.android")
}

android {
	compileSdk = (rootProject.extra["maxSdk"].toString().toInt())

	defaultConfig {
		applicationId = rootProject.extra["applicationId"] as String
		namespace = rootProject.extra["applicationId"] as String
		minSdk = (rootProject.extra["minSdk"].toString().toInt())
		targetSdk = (rootProject.extra["maxSdk"].toString().toInt())
		versionCode = rootProject.extra["versionCode"].toString().toInt()
		versionName = rootProject.extra["versionName"] as String

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
		vectorDrawables {
			useSupportLibrary = true
		}
	}

	buildFeatures {
		viewBinding = true
		compose = true
		buildConfig = true
	}

	buildTypes {
		getByName("release") {
			isMinifyEnabled = false
			proguardFiles(
				getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
			)
		}
	}

	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	kotlinOptions {
		jvmTarget = "1.8"
	}

	composeOptions {
		kotlinCompilerExtensionVersion = "1.4.3"
	}
	packaging {
		resources {
			excludes += "/META-INF/{AL2.0,LGPL2.1}"
		}
	}
}

detekt {
	toolVersion = "1.23.1"
	source.setFrom("src/main/java", "src/main/kotlin")
	parallel = true
	config.setFrom("path/to/config.yml")
	buildUponDefaultConfig = false
	allRules = false
	baseline = file("path/to/baseline.xml")
	disableDefaultRuleSets = false
	debug = true
	ignoreFailures = false
	ignoredBuildTypes = listOf("release")
	ignoredFlavors = listOf("production")
	ignoredVariants = listOf("productionRelease")
	basePath = projectDir.absolutePath
}

dependencies {
	implementation("androidx.core:core-ktx:1.12.0")
	implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
	implementation("androidx.activity:activity-compose:1.8.0")
	implementation(platform("androidx.compose:compose-bom:2023.03.00"))
	implementation("androidx.compose.ui:ui")
	implementation("androidx.compose.ui:ui-graphics")
	implementation("androidx.compose.ui:ui-tooling-preview")
	implementation("androidx.compose.material3:material3")
	implementation("androidx.appcompat:appcompat:1.6.1")
	implementation("com.google.android.material:material:1.10.0")
	implementation("androidx.constraintlayout:constraintlayout:2.1.4")
	implementation("androidx.core:core-ktx:+")
	testImplementation("junit:junit:4.13.2")
	androidTestImplementation("androidx.test.ext:junit:1.1.5")
	androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
	androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
	androidTestImplementation("androidx.compose.ui:ui-test-junit4")
	debugImplementation("androidx.compose.ui:ui-tooling")
	debugImplementation("androidx.compose.ui:ui-test-manifest")
}