# 🚀 all-in-one

> Bring your AI persona anywhere.

一个用于**跨大模型"用户风格迁移"**的工具，让你在不同 LLM（ChatGPT / Claude / 通义 / 本地模型）之间，携带自己的使用习惯与表达偏好。

## ✨ Why this exists

在使用多个大模型时，你一定遇到过：

- ❌ 换一个模型，就要重新"调教一遍"
- ❌ 好不容易培养的使用习惯全部丢失
- ❌ 每个模型都像"第一次见你"

例如：你在一个模型里已经习惯：

- 直接给代码
- 少讲概念
- 偏向工程化方案

但换到另一个模型（比如 OpenAI 的 ChatGPT）后：

> 👉 一切从零开始。

## 🎯 What all-in-one does

all-in-one 不做代理、不存 token，而是：

> 🧠 提取你的 AI 使用习惯 → 生成可迁移的 Prompt

## 🧭 How it works

### 1️⃣ 输入

- 一段或多段历史对话（来自任意模型）

### 2️⃣ 分析

- 技术背景
- 提问风格
- 回答偏好
- 表达习惯

### 3️⃣ 输出

- 一个"可复制"的 Prompt

### 4️⃣ 使用

- 粘贴到任意模型（ChatGPT / Claude / 通义）

## 🧩 Example

**输入**（来自任意模型）：

```
帮我优化这个SQL
不要讲太多原理，直接给方案
```

**输出**（生成的 Prompt）：

```
You need to adapt to the user's style:

[Technical Background]
- Backend engineer (Java, MyBatis, MongoDB)

[Response Preference]
- Provide solutions first
- Include code when possible
- Avoid long theoretical explanations

[Communication Style]
- Concise
- Structured (step-by-step)

Always follow the above style when responding.
```

### 效果

👉 粘贴到 ChatGPT / Claude 后：

- 更少废话
- 更贴近你的习惯
- 更像"老模型"

## 🔑 Key Principles

- ❌ 不存储 API Key
- ❌ 不做代理调用
- ❌ 不绑定任何模型
- ✅ 只做一件事：让你的 AI 使用习惯可以迁移

## 🏗️ Project Scope

**当前版本（MVP）：**

- 对话分析（Conversation Analyzer）
- 用户画像生成（User Profiling）
- Prompt 生成（Prompt Generator）

**未来计划：**

- 多模型 Prompt 模板（ChatGPT / Claude / 通义）
- 风格权重调节（e.g. 更代码 / 更解释）
- CLI 工具
- Web UI
- 浏览器插件（自动注入 Prompt）

## 🚀 Getting Started

（示例 CLI 设计）

```bash
all-in-one analyze chat.txt
```

输出：

```
✔ User Profile Generated
✔ Prompt Ready

Copy & Paste to your LLM:
--------------------------------
...
```

## 💡 Vision

未来使用 AI 的方式，不应该是：

> "我去适应模型"

而是：

> "模型适应我"

## 🧠 Core Idea

```
LLM ≠ Memory
Prompt + Context = Memory
```

all-in-one 的目标就是：把你的"隐性使用习惯"，变成"可迁移资产"。

## 🤝 Contributing

欢迎：

- 提交 Issue
- 分享你的 Prompt
- 优化分析策略
- 支持更多模型风格

## 📄 License

MIT

## ⭐ If this helps

如果你也：

- 经常切换 LLM
- 厌倦重复"调教模型"
- 想让 AI 更懂你

👉 给个 Star ⭐
