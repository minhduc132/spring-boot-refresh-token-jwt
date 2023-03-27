package com.fpt.edu.controllers;

import com.fpt.edu.models.BanDat;
import com.fpt.edu.repository.BanDatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/reservation")
public class BanDatController {
    @Autowired
    BanDatRepository banDatRepository;
    @ModelAttribute("danhSachBanDat")
    public List<BanDat> populateTypes() {
        return banDatRepository.findAll();
    }



//    @PostMapping("/add")
//    public String add(@Valid BanDat banDat,
//                      BindingResult result, Model model) {
//
//        for (BanDat bd : banDatRepository.danhSachBanDat(populateTypes())){
//            if (banDatRepository.existsByDate(banDat.getNgayDat())) {
//                if (banDatRepository.existsByTime(banDat.getGioDat())) {
//                    tongKhachHang += bd.getSoNguoi();
//                }
//            }
//        }
//
//        return "redirect:reservation";
//    }
}
