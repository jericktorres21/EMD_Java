CREATE TABLE IF NOT EXISTS cvent (
    cv_no INT,
    check_no INT,
    check_amt FLOAT,
    payee VARCHAR(100),
    gen_explanation VARCHAR(200),
    code INT,                   
    title VARCHAR(100),
    debit FLOAT,
    credit FLOAT,
    hda VARCHAR(5),
    explanation VARCHAR(200),
    sub_category VARCHAR(20)
);