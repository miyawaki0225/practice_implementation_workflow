
- 目次
  - 開発環境
  - プロジェクト・タスク管理
  - 仕様書
  - git_flow
    - git_commitルール
  - 製造ルール
  - ドキュメント
  - 開発フロー


# practice_implementation_workflow
仕様書の作成・設計の練習

## 解体新書で作成したベースをもとに改修・機能追加の練習を行う
https://www.amazon.co.jp/%E5%BE%8C%E6%82%94%E3%81%97%E3%81%AA%E3%81%84%E3%81%9F%E3%82%81%E3%81%AESpring-Boot-%E5%85%A5%E9%96%80%E6%9B%B8%EF%BC%9ASpring-%E8%A7%A3%E4%BD%93%E6%96%B0%E6%9B%B8%EF%BC%88%E7%AC%AC2%E7%89%88%EF%BC%89-Spring%E8%A7%A3%E4%BD%93%E6%96%B0%E6%9B%B8-ebook/dp/B08XPBPH9C

## アプリケーションの構成
- Spring:5系
- Spring Boot:2.4.1
- DB:H2

## 開発環境
- VSCODE
- トップページ（Notionを開く）
https://www.notion.so/a0763d8b1b074dd784105ec85aa158cf

## 画面構成
- ログイン画面

## 製造ルール

- コミットメッセージ

|英語|日本語|
|---|---|
|Add|追加|
|Fix|修正|
|Improve|改善|
|Update|更新|
|Remove|削除|

- ブランチ命名ルール

|英語|日本語|
|---|---|
|Hotfix-No|緊急対応|
|Improve-No|機能改善|
|Dev-No|開発|


- 開発フロー
1. developからbranchを作成
2. 対象branchに対してcommitを行う
3. pull request作成・チェックしてdevelopへmergeしてbranchを削除
4. developからmainに適時リリース

- git issue用テスト