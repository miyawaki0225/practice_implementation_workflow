package com.example.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.model.MUser;
import com.example.domain.user.service.UserService;
import com.example.form.TweetListForm;
import com.example.form.UserListForm;

@Controller
@RequestMapping("/tweet")
public class TweetListController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    /** ユーザー一覧画面を表示 */
    @GetMapping("/list")
    public String getTweetList(@ModelAttribute TweetListForm form, Model model) {

        // formをMUserクラスに変換
        MUser user = modelMapper.map(form, MUser.class);
        
        // ユーザー一覧取得
        List<MUser> tweetList = userService.getUsers(user);

        // Modelに登録
        model.addAttribute("tweetList", tweetList);
        
        // ユーザー一覧画面を表示
        return "tweet/list";
    }

    /** ユーザー検索処理 */
    @PostMapping("/list")
    public String postTweetList(@ModelAttribute UserListForm form, Model model) {

        // formをMUserクラスに変換
        MUser user = modelMapper.map(form, MUser.class);

        // ユーザー検索
        List<MUser> tweetList = userService.getUsers(user);

        // Modelに登録
        model.addAttribute("tweetList", tweetList);

        // ユーザー一覧画面を表示
        return "tweet/list";
    }
}
