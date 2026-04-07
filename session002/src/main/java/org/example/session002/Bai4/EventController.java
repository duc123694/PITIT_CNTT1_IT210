package org.example.session002.Bai4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class EventController {
    @GetMapping("/events/search")
    public String search(@RequestParam(value = "keyword", required = false, defaultValue = "") String keyword,
                         Model model){
        List<Event> resuilt = new ArrayList<>();
        resuilt.add(new Event(1, "Hội thảo Spring Framework 2026",
                "2026-06-15", 250000.0, 50));
        resuilt.add(new Event(2, "Workshop",
                "2026-07-20", 0.0, 0));
        resuilt.add(new Event(3, "Tech Summit Hà Nội",
                "2026-08-10", 1500000.0, 200));

        List<Event> filtered = resuilt.stream().filter(e -> e.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
        model.addAttribute("events", filtered);
        model.addAttribute("keyword", keyword);
        model.addAttribute("totalFound", filtered.size());
        return "search";
    }

}
