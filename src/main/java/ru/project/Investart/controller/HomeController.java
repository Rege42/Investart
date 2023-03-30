package ru.project.Investart.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.project.Investart.entity.DevTeam;
import ru.project.Investart.entity.Investor;
import ru.project.Investart.entity.OperationHistory;
import ru.project.Investart.entity.Startup;
import ru.project.Investart.repo.DevTeamRepo;
import ru.project.Investart.repo.InvestorRepo;
import ru.project.Investart.repo.OperationHistoryRepo;
import ru.project.Investart.repo.StartupRepo;

import java.util.Date;
import java.util.GregorianCalendar;

@Controller
@RequestMapping("/home")
public class HomeController {


    final DevTeamRepo devTeamRepo;
    final InvestorRepo investorRepo;
    final OperationHistoryRepo operationHistoryRepo;
    final StartupRepo startupRepo;

    public HomeController(DevTeamRepo devTeamRepo, InvestorRepo investorRepo, StartupRepo startupRepo, OperationHistoryRepo operationHistoryRepo) {
        this.devTeamRepo = devTeamRepo;
        this.investorRepo = investorRepo;
        this.startupRepo = startupRepo;
        this.operationHistoryRepo = operationHistoryRepo;
    }


    @GetMapping
    public String home(){
        return "home";
    }
}
