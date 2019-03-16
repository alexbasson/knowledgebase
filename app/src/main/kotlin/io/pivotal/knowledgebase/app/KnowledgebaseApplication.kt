package io.pivotal.knowledgebase.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KnowledgebaseApplication

fun main(args: Array<String>) {
	runApplication<KnowledgebaseApplication>(*args)
}
