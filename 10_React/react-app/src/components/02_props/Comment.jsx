import React from 'react'

const styles = {
    wrapper: {
        margin: 8,
        padding: 8,
        display: "flex",
        flexDirection: "row",
        border: "1px solid gray",
        borderradius: 16,
    },
    image: {
        width: 50,
        height: 50,
        borderradius: 25,
    },
    contentContainer: {
        marginleft: 8,
        display: "flex",
        flexDirection : "column",
        justifyContent: "center"
    }
}

function Comment() {
    return (
        <div>
            <div style={styles.wrapper}>
                <img src="https://blog.naver.com/dadaist96/222592034984?photoView=1"
                    alt="프로필이미지"
                    style={styles.image} />
            </div>
            <div style={styles.contentContainer}>
                <span>최지원</span>
                <span>안녕하세요</span>
            </div>
        </div>
    )
}

export default Comment;