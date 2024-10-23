export const CallGPT = async () => {

    //fetcj(url, json)
    //fetch는 promise객체를 반환한다.

    const response = fetch("https://api.openai/com/v1/chat/completions", {
        method: "POST",
        headers: {
            "Content-Type": "appllications/json",
            "Authorization": "Bearer ${process.env.REACT_APP_GPT_KEY}"

        },
        model: "gpt-4o-mini",
        messages: [
            { role: "system", content: "You are a helpful assistant." },
            {
                role: "user",
                content: "Write a haiku about recursion in programming.",
            },
        ],

    });


}