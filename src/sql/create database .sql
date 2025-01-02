--
-- PostgreSQL database dump
--

-- Dumped from database version 17.2
-- Dumped by pg_dump version 17.2

-- Started on 2025-01-02 19:18:55

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 226 (class 1259 OID 16537)
-- Name: tbcategoria; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tbcategoria (
    id integer NOT NULL,
    nome character varying(100),
    status character varying(50),
    urlimg character varying(255)
);


ALTER TABLE public.tbcategoria OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 16442)
-- Name: tbcidade; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tbcidade (
    idcidade integer NOT NULL,
    nomecidade character varying(100),
    idcidestado integer
);


ALTER TABLE public.tbcidade OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 16441)
-- Name: tbcidade_idcidade_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tbcidade_idcidade_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.tbcidade_idcidade_seq OWNER TO postgres;

--
-- TOC entry 4842 (class 0 OID 0)
-- Dependencies: 218
-- Name: tbcidade_idcidade_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tbcidade_idcidade_seq OWNED BY public.tbcidade.idcidade;


--
-- TOC entry 225 (class 1259 OID 16518)
-- Name: tbcliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tbcliente (
    idcliente integer NOT NULL,
    nomecliente character varying(100),
    cpf character varying(20),
    sexo character varying(15),
    clidescstatus character varying(255)
);


ALTER TABLE public.tbcliente OWNER TO postgres;

--
-- TOC entry 224 (class 1259 OID 16517)
-- Name: tbcliente_idcliente_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tbcliente_idcliente_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.tbcliente_idcliente_seq OWNER TO postgres;

--
-- TOC entry 4843 (class 0 OID 0)
-- Dependencies: 224
-- Name: tbcliente_idcliente_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tbcliente_idcliente_seq OWNED BY public.tbcliente.idcliente;


--
-- TOC entry 221 (class 1259 OID 16454)
-- Name: tbendereco; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tbendereco (
    idendereco integer NOT NULL,
    logradouro character varying(100),
    numero integer,
    complemento character varying(100),
    bairro character varying(50),
    cep integer,
    idendecidade integer
);


ALTER TABLE public.tbendereco OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 16453)
-- Name: tbendereco_idendereco_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tbendereco_idendereco_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.tbendereco_idendereco_seq OWNER TO postgres;

--
-- TOC entry 4844 (class 0 OID 0)
-- Dependencies: 220
-- Name: tbendereco_idendereco_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tbendereco_idendereco_seq OWNED BY public.tbendereco.idendereco;


--
-- TOC entry 217 (class 1259 OID 16436)
-- Name: tbestado; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tbestado (
    idestado integer NOT NULL,
    nomeestado character varying(100),
    uf character(2)
);


ALTER TABLE public.tbestado OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 16487)
-- Name: tbstatus; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tbstatus (
    idstatus integer NOT NULL,
    descrstatus character varying(20)
);


ALTER TABLE public.tbstatus OWNER TO postgres;

--
-- TOC entry 222 (class 1259 OID 16486)
-- Name: tbstatus_idstatus_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tbstatus_idstatus_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.tbstatus_idstatus_seq OWNER TO postgres;

--
-- TOC entry 4845 (class 0 OID 0)
-- Dependencies: 222
-- Name: tbstatus_idstatus_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tbstatus_idstatus_seq OWNED BY public.tbstatus.idstatus;


--
-- TOC entry 4664 (class 2604 OID 16445)
-- Name: tbcidade idcidade; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbcidade ALTER COLUMN idcidade SET DEFAULT nextval('public.tbcidade_idcidade_seq'::regclass);


--
-- TOC entry 4667 (class 2604 OID 16521)
-- Name: tbcliente idcliente; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbcliente ALTER COLUMN idcliente SET DEFAULT nextval('public.tbcliente_idcliente_seq'::regclass);


--
-- TOC entry 4665 (class 2604 OID 16457)
-- Name: tbendereco idendereco; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbendereco ALTER COLUMN idendereco SET DEFAULT nextval('public.tbendereco_idendereco_seq'::regclass);


--
-- TOC entry 4666 (class 2604 OID 16490)
-- Name: tbstatus idstatus; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbstatus ALTER COLUMN idstatus SET DEFAULT nextval('public.tbstatus_idstatus_seq'::regclass);


--
-- TOC entry 4836 (class 0 OID 16537)
-- Dependencies: 226
-- Data for Name: tbcategoria; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tbcategoria (id, nome, status, urlimg) FROM stdin;
1	Tecnologia	Ativo	
2	Passadeira	Ativo	
3	Construção	Ativo	
4	Eletricista	Ativo	
5	Saúde	Ativo	
6	Educação	Ativo	
7	Tecnologia	Ativo	
8	Transporte	Ativo	
9	Alimentação	Ativo	
10	Beleza e Estética	Ativo	
11	Manutenção e Reparos	Ativo	
12	Lazer e Entretenimento	Ativo	
13	Imobiliário	Ativo	
14	Consultoria	Ativo	
15	Segurança	Ativo	
16	Marketing	Ativo	
17	Eventos	Ativo	
18	Turismo	Ativo	
19	Finanças	Ativo	
20	Jurídico	Ativo	
\.


--
-- TOC entry 4829 (class 0 OID 16442)
-- Dependencies: 219
-- Data for Name: tbcidade; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tbcidade (idcidade, nomecidade, idcidestado) FROM stdin;
1	Rio Branco	1
2	Maceió	2
3	Macapá	3
4	Manaus	4
5	Salvador	5
6	Fortaleza	6
7	Brasília	7
8	Vitória	8
9	Goiânia	9
10	São Luís	10
11	Cuiabá	11
12	Campo Grande	12
13	Belo Horizonte	13
14	Belém	14
15	João Pessoa	15
16	Curitiba	16
17	Recife	17
18	Teresina	18
19	Rio de Janeiro	19
20	Natal	20
21	Porto Alegre	21
22	Porto Velho	22
23	Boa Vista	23
24	Florianópolis	24
25	São Paulo	25
26	Aracaju	26
27	Palmas	27
\.


--
-- TOC entry 4835 (class 0 OID 16518)
-- Dependencies: 225
-- Data for Name: tbcliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tbcliente (idcliente, nomecliente, cpf, sexo, clidescstatus) FROM stdin;
1	José Santos	000.000.000-00	Masculino	Ativo
\.


--
-- TOC entry 4831 (class 0 OID 16454)
-- Dependencies: 221
-- Data for Name: tbendereco; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tbendereco (idendereco, logradouro, numero, complemento, bairro, cep, idendecidade) FROM stdin;
1	Lago Azul	202	Casa verde com marrom	Parque Tremendão	74394230	9
2	Rua das Flores	123	Apto 101	Jardim Primavera	12345678	1
3	Avenida Central	456	Bloco B	Centro	87654321	2
4	Rua do Sol	789	Casa 2	Vila Nova	23456789	3
5	Praça da Liberdade	101	Cobertura	Liberdade	34567890	4
6	Rua das Palmeiras	202	Fundos	Palmeiras	45678901	5
7	Avenida Paulista	303	Sala 5	Bela Vista	56789012	6
8	Rua das Acácias	404	Casa 3	Acácias	67890123	7
9	Avenida das Nações	505	Apto 202	Nações Unidas	78901234	8
\.


--
-- TOC entry 4827 (class 0 OID 16436)
-- Dependencies: 217
-- Data for Name: tbestado; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tbestado (idestado, nomeestado, uf) FROM stdin;
1	Acre	AC
2	Alagoas	AL
3	Amapá	AP
4	Amazonas	AM
5	Bahia	BA
6	Ceará	CE
7	Distrito Federal	DF
8	Espírito Santo	ES
9	Goiás	GO
10	Maranhão	MA
11	Mato Grosso	MT
12	Mato Grosso do Sul	MS
13	Minas Gerais	MG
14	Pará	PA
15	Paraíba	PB
16	Paraná	PR
17	Pernambuco	PE
18	Piauí	PI
19	Rio de Janeiro	RJ
20	Rio Grande do Norte	RN
21	Rio Grande do Sul	RS
22	Rondônia	RO
23	Roraima	RR
24	Santa Catarina	SC
25	São Paulo	SP
26	Sergipe	SE
27	Tocantins	TO
\.


--
-- TOC entry 4833 (class 0 OID 16487)
-- Dependencies: 223
-- Data for Name: tbstatus; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tbstatus (idstatus, descrstatus) FROM stdin;
\.


--
-- TOC entry 4846 (class 0 OID 0)
-- Dependencies: 218
-- Name: tbcidade_idcidade_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tbcidade_idcidade_seq', 1, false);


--
-- TOC entry 4847 (class 0 OID 0)
-- Dependencies: 224
-- Name: tbcliente_idcliente_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tbcliente_idcliente_seq', 1, false);


--
-- TOC entry 4848 (class 0 OID 0)
-- Dependencies: 220
-- Name: tbendereco_idendereco_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tbendereco_idendereco_seq', 1, false);


--
-- TOC entry 4849 (class 0 OID 0)
-- Dependencies: 222
-- Name: tbstatus_idstatus_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tbstatus_idstatus_seq', 1, false);


--
-- TOC entry 4679 (class 2606 OID 16541)
-- Name: tbcategoria tbcategoria_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbcategoria
    ADD CONSTRAINT tbcategoria_pkey PRIMARY KEY (id);


--
-- TOC entry 4671 (class 2606 OID 16447)
-- Name: tbcidade tbcidade_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbcidade
    ADD CONSTRAINT tbcidade_pkey PRIMARY KEY (idcidade);


--
-- TOC entry 4677 (class 2606 OID 16523)
-- Name: tbcliente tbcliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbcliente
    ADD CONSTRAINT tbcliente_pkey PRIMARY KEY (idcliente);


--
-- TOC entry 4673 (class 2606 OID 16459)
-- Name: tbendereco tbendereco_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbendereco
    ADD CONSTRAINT tbendereco_pkey PRIMARY KEY (idendereco);


--
-- TOC entry 4669 (class 2606 OID 16440)
-- Name: tbestado tbestado_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbestado
    ADD CONSTRAINT tbestado_pkey PRIMARY KEY (idestado);


--
-- TOC entry 4675 (class 2606 OID 16492)
-- Name: tbstatus tbstatus_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbstatus
    ADD CONSTRAINT tbstatus_pkey PRIMARY KEY (idstatus);


--
-- TOC entry 4680 (class 2606 OID 16448)
-- Name: tbcidade tbcidade_idcidestado_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbcidade
    ADD CONSTRAINT tbcidade_idcidestado_fkey FOREIGN KEY (idcidestado) REFERENCES public.tbestado(idestado);


--
-- TOC entry 4681 (class 2606 OID 16460)
-- Name: tbendereco tbendereco_idendecidade_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbendereco
    ADD CONSTRAINT tbendereco_idendecidade_fkey FOREIGN KEY (idendecidade) REFERENCES public.tbcidade(idcidade);


-- Completed on 2025-01-02 19:18:55

--
-- PostgreSQL database dump complete
--

