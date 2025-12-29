package dev.java10x.Fridge.service;


import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    //listar
    public List<Food> getAll() {return foodRepository.findAll();
    //criar
        }



    }

