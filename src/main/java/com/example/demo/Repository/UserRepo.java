package com.example.demo.Repository;

import com.example.demo.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long>
{
}
