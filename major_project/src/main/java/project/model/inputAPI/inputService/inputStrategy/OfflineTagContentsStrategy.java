package project.model.inputAPI.inputService.inputStrategy;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import project.model.inputAPI.inputService.InputAPIService;

/**
 *  Offline strategy injected into Tag Contents getting service
 */
public class OfflineTagContentsStrategy implements InputServiceStrategy {
    @Override
    public JsonObject behave(InputAPIService service) {
        String response = "{\"response\":{\"status\":\"ok\",\"userTier\":\"developer\",\"total\":9,\"startIndex\":1,\"pageSize\":5,\"currentPage\":1,\"pages\":2,\"orderBy\":\"newest\",\"tag\":{\"id\":\"games/apple-arcade\",\"type\":\"keyword\",\"sectionId\":\"games\",\"sectionName\":\"Games\",\"webTitle\":\"Apple Arcade\",\"webUrl\":\"https://www.theguardian.com/games/apple-arcade\",\"apiUrl\":\"https://content.guardianapis.com/games/apple-arcade\"},\"results\":[{\"id\":\"games/2022/feb/17/the-15-best-games-on-apple-arcade\",\"type\":\"article\",\"sectionId\":\"games\",\"sectionName\":\"Games\",\"webPublicationDate\":\"2022-02-17T10:00:33Z\",\"webTitle\":\"The 15 best games on Apple Arcade\",\"webUrl\":\"https://www.theguardian.com/games/2022/feb/17/the-15-best-games-on-apple-arcade\",\"apiUrl\":\"https://content.guardianapis.com/games/2022/feb/17/the-15-best-games-on-apple-arcade\",\"isHosted\":false,\"pillarId\":\"pillar/arts\",\"pillarName\":\"Arts\"},{\"id\":\"games/2021/apr/22/clap-hanz-golf-review-virtual-golf-thats-fun-for-everybody\",\"type\":\"article\",\"sectionId\":\"games\",\"sectionName\":\"Games\",\"webPublicationDate\":\"2021-04-22T07:00:33Z\",\"webTitle\":\"Clap Hanz Golf review virtual golf that’s fun for everybody\",\"webUrl\":\"https://www.theguardian.com/games/2021/apr/22/clap-hanz-golf-review-virtual-golf-thats-fun-for-everybody\",\"apiUrl\":\"https://content.guardianapis.com/games/2021/apr/22/clap-hanz-golf-review-virtual-golf-thats-fun-for-everybody\",\"isHosted\":false,\"pillarId\":\"pillar/arts\",\"pillarName\":\"Arts\"},{\"id\":\"games/2021/apr/14/fantasian-review-iphone-game-apple-arcade\",\"type\":\"article\",\"sectionId\":\"games\",\"sectionName\":\"Games\",\"webPublicationDate\":\"2021-04-14T11:00:37Z\",\"webTitle\":\"Fantasian review Beautiful, if not always bold iPhone game\",\"webUrl\":\"https://www.theguardian.com/games/2021/apr/14/fantasian-review-iphone-game-apple-arcade\",\"apiUrl\":\"https://content.guardianapis.com/games/2021/apr/14/fantasian-review-iphone-game-apple-arcade\",\"isHosted\":false,\"pillarId\":\"pillar/arts\",\"pillarName\":\"Arts\"},{\"id\":\"games/2021/feb/25/nuts-a-surveillance-mystery-review-ios-pc-nintendo-switch\",\"type\":\"article\",\"sectionId\":\"games\",\"sectionName\":\"Games\",\"webPublicationDate\":\"2021-02-25T10:00:24Z\",\"webTitle\":\"Nuts: a Surveillance Mystery review squirrel snapper's delight takes a dark turn\",\"webUrl\":\"https://www.theguardian.com/games/2021/feb/25/nuts-a-surveillance-mystery-review-ios-pc-nintendo-switch\",\"apiUrl\":\"https://content.guardianapis.com/games/2021/feb/25/nuts-a-surveillance-mystery-review-ios-pc-nintendo-switch\",\"isHosted\":false,\"pillarId\":\"pillar/arts\",\"pillarName\":\"Arts\"},{\"id\":\"technology/2020/sep/11/apple-one-subscription-bundle\",\"type\":\"article\",\"sectionId\":\"technology\",\"sectionName\":\"Technology\",\"webPublicationDate\":\"2020-09-11T15:44:17Z\",\"webTitle\":\"Apple One services bundle could be launched within days\",\"webUrl\":\"https://www.theguardian.com/technology/2020/sep/11/apple-one-subscription-bundle\",\"apiUrl\":\"https://content.guardianapis.com/technology/2020/sep/11/apple-one-subscription-bundle\",\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"}],\"leadContent\":[]}}";
        JsonObject contentsResponse = (JsonObject) JsonParser.parseString(response);

        return contentsResponse;
    }
}