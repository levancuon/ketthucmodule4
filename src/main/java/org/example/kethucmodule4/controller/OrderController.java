package org.example.kethucmodule4.controller;

import org.example.kethucmodule4.model.Categories;
import org.example.kethucmodule4.model.Orders;
import org.example.kethucmodule4.model.Products;
import org.example.kethucmodule4.service.ICategoryService;
import org.example.kethucmodule4.service.IOrderService;
import org.example.kethucmodule4.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.Date;
import java.time.LocalDate;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IProductService productService;
    @ModelAttribute("products")
    public Iterable<Products> products(){
        return productService.findAll();
    }
    @Autowired
    private ICategoryService categoryService;
    @ModelAttribute("categories")
    public Iterable<Categories> categories(){
        return categoryService.findAll();
    }
    @Autowired
    private IOrderService orderService;
    @GetMapping("")
    private String home(Model model
     ){
        Iterable<Orders> orders = orderService.findAll();
        model.addAttribute("orders",orders);
        return "/home";
    }
    @GetMapping("/edit/{id}")
    private String edit(Model model,@PathVariable("id") Long id){
        Orders order = orderService.findById(id);
        model.addAttribute("order",order);
        return "/edit";
    }
    @PostMapping("/edit")
    private String saveOrder(@ModelAttribute("order") Orders order){

//        if (bindingResult.hasFieldErrors()){
//            return "/edit";
//        }
//        redirectAttributes.addFlashAttribute("message", "Lưu thành công");
        orderService.save(order);
        return "redirect:/order";
    }
    @GetMapping("/search")
    private String search(@RequestParam(required = false,name = "dayMin") LocalDate dayMin,
                          @RequestParam(required = false,name = "dayMax") LocalDate dayMax,
                          Model model){
        Iterable<Orders> orders = orderService.findByDay(dayMin,dayMax);
        model.addAttribute("orders",orders);
        return "/search";

    }

}
