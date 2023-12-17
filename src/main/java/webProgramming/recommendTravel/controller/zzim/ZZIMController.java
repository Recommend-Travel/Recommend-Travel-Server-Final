package webProgramming.recommendTravel.controller.zzim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import webProgramming.recommendTravel.service.zzim.ZZIMService;

@RestController
public class ZZIMController {
    // 찜 api 여기서 받음
    @Autowired
    private ZZIMService zzimService;
}
