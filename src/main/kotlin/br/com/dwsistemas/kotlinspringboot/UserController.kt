package br.com.dwsistemas.kotlinspringboot

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.web.bind.annotation.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@RestController
@RequestMapping("/user")
class UserController(val repository: UserRepository) {

    @GetMapping
    fun getAll() = repository.findAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long) = repository.findById(id)

    @PostMapping
    fun insert(@RequestBody user: User) = repository.save(user)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = repository.deleteById(id)

}

@Entity
class User(var nome: String,
           @Id
           @GeneratedValue(strategy = GenerationType.AUTO)
           var id: Long = 0)

interface UserRepository: JpaRepository<User, Long>