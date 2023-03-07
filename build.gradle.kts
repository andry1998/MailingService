import com.google.protobuf.gradle.id

plugins {
	`java-library`
	id("org.springframework.boot") version "3.0.2"
	id("io.spring.dependency-management") version "1.1.0"
	id("com.google.protobuf") version "0.9.1"
}

group = "ru.mgt"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
	maven {
		url = uri("https://packages.confluent.io/maven")
	}
}

val protoCompilerVer: String by properties
val protoGenGrpcVer: String by properties
val protoSrcDir: String by properties
val protoGenDir: String by properties


sourceSets {
	main {
		proto {
			srcDir(protoSrcDir)
		}
	}
}


dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.0.2")
	implementation("io.swagger.core.v3:swagger-annotations:2.2.8")
	implementation("org.springframework.boot:spring-boot-starter-actuator:3.0.1")
	implementation("org.springframework.security:spring-security-web")
	implementation("ru.mgt.icp:contracts:0.0.3")
	implementation("ru.mgt.icp:shared:0.0.5")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.postgresql:postgresql:42.2.27")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	implementation("io.github.lognet:grpc-spring-boot-starter:5.0.0")

	compileOnly("com.google.protobuf:protobuf-java:$protoCompilerVer")
	compileOnly("io.grpc:grpc-protobuf:$protoGenGrpcVer")
	compileOnly("io.grpc:grpc-stub:$protoGenGrpcVer")
	compileOnly("javax.annotation:javax.annotation-api:1.3.2")



	lombok("1.18.24")
	kafka()
}

tasks.withType<Copy> {
	duplicatesStrategy = DuplicatesStrategy.INCLUDE
}

protobuf {
	protoc {
		artifact = "com.google.protobuf:protoc:$protoCompilerVer"
	}
	plugins {
		id("grpc") {
			artifact = "io.grpc:protoc-gen-grpc-java:$protoGenGrpcVer"
		}
	}

	generatedFilesBaseDir = protoGenDir

	generateProtoTasks {
		all().forEach {
			it.builtins {
				java {}
			}
			it.plugins {
				id("grpc") {}
			}
		}
	}
}






		fun DependencyHandlerScope.lombok(version : String) {
	val artifact = "org.projectlombok:lombok:$version"

	compileOnly(artifact)
	annotationProcessor(artifact)

	testCompileOnly(artifact)
	testAnnotationProcessor(artifact)
}

fun DependencyHandlerScope.kafka() {
	implementation("org.apache.kafka:kafka-streams:3.3.1")
	implementation("org.springframework.kafka:spring-kafka")
	implementation("io.confluent:kafka-streams-protobuf-serde:7.3.0")
}


