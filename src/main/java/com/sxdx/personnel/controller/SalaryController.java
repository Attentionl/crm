package com.sxdx.personnel.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李今朝
 * @className SalaryController
 * @version1.0
 * @description
 * @createdTime 2020/2/20 13:25
 */
@RestController
@RequestMapping("employee")
@Transactional(rollbackFor = Exception.class)
public class SalaryController {
}
