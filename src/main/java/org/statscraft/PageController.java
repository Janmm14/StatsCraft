/*
 * Copyright (c) 2016 StatsCraft Authors and Contributors.
 */

package org.statscraft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This controller serves general pages to the user, such as the home-page.
 *
 * @author SirFaizdat
 */
@Controller public class PageController {

    @RequestMapping("/") public String index() {
        return "index";
    }

}
