package com.acn.data

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.*
import javax.persistence.*
import javax.validation.Valid

@Entity
data class Person(
        var firstName: String = "",
        var lastName: String = "",
        @Id
        @GeneratedValue
        val id: Long = 0
)

interface PersonRepository: JpaRepository<Person, Long> {

}

@RestController
@RequestMapping("/api")
class PersonController(val repo:PersonRepository)
{

        @GetMapping("/people")
        fun findAll(): List<Person> = repo.findAll()
        @PostMapping("/people")
        fun save(@RequestBody @Valid person: Person) = repo.save(person)

}