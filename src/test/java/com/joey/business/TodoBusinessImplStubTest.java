package com.joey.business;

import com.joey.data.api.TodoService;
import com.joey.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplStubTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl= new TodoBusinessImpl(todoServiceStub);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");

        assertEquals(2,filteredTodos.size());
    }
}
