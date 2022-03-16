import Link from 'next/link';
import { useEffect, useState } from 'react';
import BoardList from '/components/Board/BoardList.js';
import WriteReview from '/components/Board/WriteReview.js';
import ModifyReview from '/components/Board/ModifyReview.js';
import DetailReview from '/components/Board/DetailReview.js';

function board() {

    const [page, setPage] = useState("기본");
    const highFunction = (text) => {
        setPage(text);
    }

    useEffect(() => {
        window.scrollTo(0, 700);
      }, [page]);

    return (
        <>
            <div>
                {
                    page === "기본" && <BoardList propFunction={highFunction} />
                }
                {
                    page === "작성" && <WriteReview propFunction={highFunction}  />
                }
                {
                    page === "수정" && <ModifyReview propFunction={highFunction}  />
                }
                {
                    page === "상세" && <DetailReview propFunction={highFunction}  />
                }
            </div>
        </>
    );
}

export default board;