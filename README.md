## 課題レポート3: リファクタリングを通してユニットテストとバージョン管理に慣れよう
- ステップ1: コードの準備。
  - 本来はgradleでbuildしてコードをコピーして修正するが、コピーではなくcloneでもなくちゃんと(?)forkを試したい
  - GitHubでnaltoma先生のリポジトリをforkする
  - forkしたリポジトリをcloneする
  - 動作確認1：通常実行。
  - 動作確認2：テスト実行。
  - .gitignoreにbuildが含まれているから自動でapp/buildはaddされない
- ステップ2: 死亡した後で攻撃できてしまう件をどうにかしたい。
  -  EnemyTestのattack()に条件を加えて死んだら攻撃できないようにする
- ステップ3: カプセル化しよう。
  - privateのフィールドに変更してアクセサを作る
- (おまけ)ステップ4: アクセサのJavaDocを書こう。
  - ```bash
    cd app
    javadoc -d docs -sourcepath src/main/java -subpackages jp.ac.uryukyu.ie.e245719
---
## 課題レポート4: リファクタリングを通して継承に慣れよう
- ステップ0: コードの準備。
- ステップ1: EnemyクラスとHeroクラスの重複をどうにかしたい
- ステップ2: Heroクラスの上位職を作ってみよう。
