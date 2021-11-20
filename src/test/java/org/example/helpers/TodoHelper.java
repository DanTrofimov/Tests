package org.example.helpers;

import org.example.AppManager;
import org.example.entities.TodoItem;
import org.openqa.selenium.By;

public class TodoHelper extends HelperBase {

    public TodoHelper(AppManager appManager) {
        this.driver = appManager.getDriver();
    };

    public void createTodo(TodoItem todo) {
        driver.findElement(By.name("todoText")).click();
        driver.findElement(By.name("todoText")).sendKeys(todo.text);
        driver.findElement(By.cssSelector(".todo-form > button")).click();
    }

    public void deleteTodo() {
        // deleting last todo item
        driver.findElement(By.cssSelector(".todo-list > div:first-child > form:nth-last-child(2) .todo-button-wrapper button:last-child")).click();
    }
}
