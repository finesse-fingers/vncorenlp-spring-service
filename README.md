# Vn Core NLP Spring boot service

Aim of this project is to remove bottlenecks with multithreading related to python wrapper.

## Usage

Start server, server will listen on localhost:8080. The available routes are:

* `annotate/wseg`
* `annotate/pos`
* `annotate/ner`
* `annotate/parse`

Example request:

```bash
curl --location --request GET 'http://localhost:8080/annotate/parse' \
--header 'Content-Type: application/json' \
--data-raw '{
    "text": "Ông Nguyễn Khắc Chúc  đang làm việc tại Đại học Quốc gia Hà Nội. Bà Lan, vợ ông Chúc, cũng làm việc tại đây."
}'
```
