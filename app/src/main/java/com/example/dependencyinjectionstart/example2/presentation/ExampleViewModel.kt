package com.example.dependencyinjectionstart.example2.presentation

import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.di.IdQualifiers
import com.example.dependencyinjectionstart.example2.di.NameQualifiers
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifiers private val id: String,
    @NameQualifiers private val name: String
): ViewModel() {

    fun method() {
        useCase()
    }
}
